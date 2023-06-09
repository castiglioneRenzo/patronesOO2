package ar.edu.unlp.info.oo2.ejercicio_7;

import java.time.Duration;
import java.time.Instant;

public class Pending implements ToDoItemState {
	public Pending() {
	}
	public void start(ToDoItem context) {
		context.setStartTime(Instant.now());
		context.setState(new InProgress());
	}
	public void togglePause(ToDoItem context){
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
	}
	public void finish(ToDoItem context) {
		//do nothing
	}
	
	public Duration workedTime(Instant startTime) {
		throw new RuntimeException("El item todavía no inició");
	}
	
	public String toString() {
		return "Pending";
	}
}
