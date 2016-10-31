public class Codeclan{
  private String name;
  private Student[] roll;
  private int price;

  public Codeclan(String name, int price){
    this.name = name;
    this.roll = new Student[21];
    this.price = price;
  }

  public String getName(){
    return this.name;
  }

  public int personCount(){
    int counter = 0;

    for (Student person : roll ) {
      if (person != null){
        counter++;
      }
    }

    return counter;

  }

  public void enrol(Student student){
    if ( rollFull() ) {
      return;
    }
    int persons = personCount();
    roll[persons] = student;
  }

  public boolean rollFull() {
    return personCount() == roll.length;
  }

}