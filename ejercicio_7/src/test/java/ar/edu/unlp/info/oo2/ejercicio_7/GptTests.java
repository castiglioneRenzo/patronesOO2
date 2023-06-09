/*
 * package ar.edu.unlp.info.oo2.ejercicio_7;
 * 
 * import static org.junit.jupiter.api.Assertions.*;
 * 
 * import org.junit.jupiter.api.Test;
 * 
 * import java.time.Duration; import java.time.Instant;
 * 
 * public class GptTests {
 * 
 * @Test public void testCreateToDoItem() { ToDoItem item = new
 * ToDoItem("Test ToDoItem"); assertEquals("Test ToDoItem", item.getName());
 * assertTrue(item.getState() instanceof Pending); }
 * 
 * @Test public void testStartToDoItem() { ToDoItem item = new
 * ToDoItem("Test ToDoItem"); item.start(); assertTrue(item.getState()
 * instanceof InProgress); assertNotNull(item.workedTime()); }
 * 
 * @Test(expected = RuntimeException.class) public void
 * testTogglePauseToDoItemFromPending() { ToDoItem item = new
 * ToDoItem("Test ToDoItem"); item.togglePause(); }
 * 
 * @Test public void testTogglePauseToDoItem() { ToDoItem item = new
 * ToDoItem("Test ToDoItem"); item.start(); item.togglePause();
 * assertTrue(item.getState() instanceof Paused); }
 * 
 * @Test(expected = RuntimeException.class) public void
 * testFinishToDoItemFromPending() { ToDoItem item = new
 * ToDoItem("Test ToDoItem"); item.finish(); }
 * 
 * @Test public void testFinishToDoItem() { ToDoItem item = new
 * ToDoItem("Test ToDoItem"); item.start(); item.finish();
 * assertTrue(item.getState() instanceof Finished); }
 * 
 * @Test(expected = RuntimeException.class) public void
 * testWorkedTimeToDoItemNotStarted() { ToDoItem item = new
 * ToDoItem("Test ToDoItem"); item.workedTime(); }
 * 
 * @Test public void testWorkedTimeToDoItemStarted() throws InterruptedException
 * { ToDoItem item = new ToDoItem("Test ToDoItem"); item.start();
 * Thread.sleep(1000); Duration timeElapsed = item.workedTime();
 * assertTrue(timeElapsed.getSeconds() >= 1); }
 * 
 * @Test(expected = RuntimeException.class) public void
 * testAddCommentToDoItemFinished() { ToDoItem item = new
 * ToDoItem("Test ToDoItem"); item.start(); item.finish();
 * item.addComment("Test comment"); }
 * 
 * @Test public void testAddCommentToDoItemNotFinished() { ToDoItem item = new
 * ToDoItem("Test ToDoItem"); item.start(); item.addComment("Test comment");
 * assertEquals(1, item.getComments().size()); assertEquals("Test comment",
 * item.getComments().get(0)); } }
 */