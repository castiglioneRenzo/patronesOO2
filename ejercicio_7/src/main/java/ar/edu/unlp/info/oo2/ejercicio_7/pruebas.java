package ar.edu.unlp.info.oo2.ejercicio_7;
import java.util.List;

public class pruebas {

	public static void main(String[] args) {
			ToDoItem item1 = new ToDoItem("estudiar oo2");
			ToDoItem item2 = new ToDoItem("estudiar cyplp");
			item1.start();
			item1.addComment("to to list ejercicio7");
			for(String c:item1.getComments()) {
				System.out.println(c);
			}
			item1.togglePause();
			try {
			item2.workedTime();
			}
			catch (Exception e){
				System.out.println(e.getMessage());
			}
			
			item1.togglePause();
			System.out.println(item1.workedTime());
			item2.start();
			item2.togglePause();
			item2.finish();
			item1.finish();
			System.out.println(item1.workedTime());
		}

}
