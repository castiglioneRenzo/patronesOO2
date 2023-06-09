package ar.edu.unlp.info.oo2.ejercicio_7;

import java.time.Duration;
import java.time.Instant;

public class Finished implements ToDoItemState {
	private Instant finishTime;
	public Finished() {
		this.finishTime = Instant.now(); 
	}
	public void start(ToDoItem context) {
		//do nothing
	}
	public void togglePause(ToDoItem context) {
		//do nothing
	}
	public void finish(ToDoItem context) {
		//do nothing
	}
	public Duration workedTime(Instant startTime) {
		return Duration.between(startTime, finishTime);
	}
	public String toString() {
		return "Finished";
	}
}