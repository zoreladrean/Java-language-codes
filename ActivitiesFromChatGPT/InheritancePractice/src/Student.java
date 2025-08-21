public class Student extends Person {
  int grade;

  public Student ( String name, int age, int grade ) {
    super ( name, age );
    this.grade = grade;
  }

  @Override
  public void introduce ( ) {
    System.out.println( "Hi, my name is " + name + " and I am " + age + " years old, and I am in grade " + grade + "." );
  }
}
