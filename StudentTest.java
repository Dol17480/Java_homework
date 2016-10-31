import static org.junit.Assert.assertEquals;
import org.junit.*;

public class StudentTest{
  Student student;
  Codeclan codeclan;

  @Before 
  public void before() {
    codeclan = new Codeclan("Cohort 7", 4500);
    student = new Student("David", 4500, 'M' );
  }

  @Test
  public void hasFunds(){
    assertEquals( 4500, student.checkFunds() ); 
  }

  @Test
  public void hasGender(){
    assertEquals( 'M', student.checkGender() ); 
  }


}