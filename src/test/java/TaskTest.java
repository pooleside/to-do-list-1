import org.junit.*;
import static org.junit.Assert.*;

public class TaskTest {

  @Test
  public void Task_instantiatesCorrectly_true(){
    Task myT = new Task("Call home");
    assertEquals(true, myT instanceof Task); //checking if an instance of the class will show up, therefore true.

  }

}
