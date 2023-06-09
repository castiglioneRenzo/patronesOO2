package ar.edu.unlp.info.oo2.ejercicio_7;

import java.time.Duration;
import java.time.Instant;

public class InProgress implements ToDoItemState {
	public InProgress() {
	}
	public void start(ToDoItem context) {
		//do nothing
	}
	public void togglePause(ToDoItem context) {
		context.setState(new Paused());
	}
	public void finish(ToDoItem context) {
		context.setState(new Finished());
	}
	public Duration workedTime(Instant startTime) {
		return Duration.between(startTime, Instant.now());
	}
	public String toString() {
		return "InProgress";
	}
}
