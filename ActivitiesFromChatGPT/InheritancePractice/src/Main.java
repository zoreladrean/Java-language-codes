public class Main {
  public static void main(String[] args) {
    Person p = new Person( "person's name", 30 );
    Student s = new Student("student's name", 17, 12);

    p.introduce();
    s.introduce();
  }
}
