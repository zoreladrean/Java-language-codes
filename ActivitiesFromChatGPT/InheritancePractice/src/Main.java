public class Main {
  public static void main(String[] args) {
    Person p = new Person( "person's name", 30 );
    Student s = new Student("student's name", 17, 12);

    p.introduce();
    s.introduce();
  }
}

// In your main: Create one Person and one Student object.
// Call introduce() on both.
// Observe how the same method name behaves differently (polymorphism through inheritance).