import static org.junit.Assert.assertEquals;
import org.junit.*;

public class CodeclanTest{
  Codeclan codeclan;
  Student student;

  @Before 
  public void before() {
    codeclan = new Codeclan("Cohort 7", 4500);
    student = new Student("David", 4500, 'M' );
  }

  @Test
  public void hasName(){
    assertEquals( "Cohort 7", codeclan.getName() ); 
  }

  @Test
  public void rollStartsEmpty(){
    assertEquals(0, codeclan.personCount() );
  }

  @Test
  public void canEnrolStudent(){
    codeclan.enrol(student);
    assertEquals(1, codeclan.personCount());
  }

  @Test
  public void cantEnrolWhenRollFull(){
    for (int i = 0; i < 25; i++){
      codeclan.enrol(student);
    }
    assertEquals(21, codeclan.personCount());
  }

  @Test
  public void rollIsFull(){
    for (int i = 0; i < 25; i++){
      codeclan.enrol(student);
    }
    assertEquals(true, codeclan.rollFull());
  }


}