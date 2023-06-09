package ar.edu.unlp.info.oo2.ejercicio_7;

import java.time.Duration;
import java.time.Instant;

public interface ToDoItemState {
	public abstract void start(ToDoItem context);
	public abstract void togglePause(ToDoItem context);
	public abstract void finish(ToDoItem context);
	public abstract Duration workedTime(Instant startTime);
}
