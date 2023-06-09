package ar.edu.unlp.info.oo2.ejercicio_7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ToDoItemTest {
	private ToDoItem item;
	@BeforeEach
	void setUp() {
		item = new ToDoItem("Un item de prueba");
	}
	@DisplayName("Item en estado 'Pending'")
	@Test
	void testPending() {
		assertEquals("Pending", item.getState().toString());
	}
	@DisplayName("Trancision de estado 'Pending' a 'InProgress'")
	@Test
	void testPendingInProgress() {
		assertEquals("Pending", item.getState().toString());
		item.start();
		assertEquals("InProgress", item.getState().toString());
	}
	@DisplayName("Trancision de estado 'Pending' a 'InProgress'")
	@Test
	void testPendingPaused() {				
		Throwable exception = assertThrows(RuntimeException.class, () -> item.togglePause());
		    assertEquals("El objeto ToDoItem no se encuentra en pause o in-progress", exception.getMessage());
		assertEquals("Pending", item.getState().toString());
	}
	
	@DisplayName("Trancision de estado 'Pending' a 'Finished'")
	@Test
	void testPendingFinished() {		
		item.finish();
		assertEquals("Pending", item.getState().toString());
	}
	@DisplayName("Método workedTime en estado 'Pending'")
	@Test
	void testPendingWorkedTime() {				
		Throwable exception = assertThrows(RuntimeException.class, () -> item.workedTime());
		    assertEquals("El item todavía no inició", exception.getMessage());		
	}
	
	@DisplayName("Transicion de estado 'InProgress' a 'Paused'")
	@Test
	void testInProgressPaused() {
		item.start();
		item.togglePause();
		assertEquals("Paused", item.getState().toString());
	}
	
	
	@DisplayName("Transicion de estado 'In Progress' a 'Finished'")
	@Test
	void testInProgressFinished() {
		item.start();
		item.finish();
		assertEquals("Finished", item.getState().toString());
	}
	@DisplayName("Transicion de estado 'Paused' a 'InProgress'")
	@Test
	void testPausedInProgress() {
		item.start();
		item.togglePause();
		item.togglePause();
		assertEquals("InProgress", item.getState().toString());
	}
	@DisplayName("Transicion de estado 'Paused' a 'Finished'")
	@Test
	void testPausedFinished() {
		item.start();
		item.togglePause();
		item.finish();
		assertEquals("Finished", item.getState().toString());
	}

}
