public class Student extends Person {
  int grade;

  public Student ( String name, int age, int grade ) {
    this.name = name;
    this.age = age;
    this.grade = grade;
  }

  public void introduce ( ) {
    System.out.println( "Hi, my name is " + name + " and I am " + age + " years old, and I am in grade " + grade + "." );
  }
}
