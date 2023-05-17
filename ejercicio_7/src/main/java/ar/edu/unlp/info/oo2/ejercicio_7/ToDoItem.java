package ar.edu.unlp.info.oo2.ejercicio_7;
//pattern used: State
import java.util.ArrayList;
import java.util.List;
import java.time.Duration;
import java.time.Instant;

public class ToDoItem {
	private String name;
	private List<String> comments;
	private ToDoItemState state;
	private Instant startTime;
		/**
		* Instancia un ToDoItem nuevo en estado pending con <name> como nombre.
		*/
        public ToDoItem(String name) {
        	this.name = name;
        	this.comments = new ArrayList<String>();
        	state = new Pending();
        }

	   	/**
		* Pasa el ToDoItem a in-progress, siempre y cuando su estado actual sea
		* pending. Si se encuentra en otro estado, no hace nada.
		*/
        public void start() {
        	state.start(this);        	
        }

		/**
		* Pasa el ToDoItem a paused si su estado es in-progress, o a in-progress si su
		* estado es paused. Caso contrario (pending o finished) genera un error
		* informando la causa específica del mismo.
		*/
        public void togglePause() {
        	state.togglePause(this);
        }
        
		/**
		* Pasa el ToDoItem a finished, siempre y cuando su estado actual sea 
		* in-progress o paused. Si se encuentra en otro estado, no hace nada.
		*/
        public void finish() {
        	state.finish(this);
        }


		/**
		* Retorna el tiempo que transcurrió desde que se inició el ToDoItem (start)
		* hasta que se finalizó. En caso de que no esté finalizado, el tiempo que
		* haya transcurrido hasta el momento actual. Si el ToDoItem no se inició,
		* genera un error informando la causa específica del mismo.
		*/
		public Duration workedTime() {  
			return state.workedTime(startTime);
		}

		protected void setState(ToDoItemState state) {
        	this.state = state;
        }
		
		/**
		* Agrega un comentario al ToDoItem siempre y cuando no haya finalizado. Caso
		* contrario no hace nada."
		*/
        public void addComment(String comment) {
        	this.comments.add(comment);
        }
        /**
         * Devuele una lista con todos los comentarios*/
        public List<String> getComments() {
        	return this.comments;
        }
        
        /**
         * Devuelve el nombre del Item */
        public String getName() {
        	return this.name;
        }
        /**
         *Provee un método para que el estado pueda asignar el tiempo de inicio */
        protected void setStartTime(Instant time) {
        	this.startTime = time;
        }
        /**
         * Devolver estado*/
        public ToDoItemState getState() {
        	return state;
        }
}
