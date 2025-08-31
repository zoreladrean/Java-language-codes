public class Teacher extends Person {
  String subject;

  public Teacher ( String subject, String name, int age ) {
    super(name, age);
    this.subject = subject;
  }

  @Override
  public void introduce ( ) {
    System.out.println( "Hi, my name is " +name+ ", I am " +age+ " years old. and I teach " +subject+ "." );
  }

}

// Add another subclass Teacher that extends Person.
// Extra attribute: subject (String).
// Override introduce() to say:
// Hi, my name is <name>, I am <age> years old, and I teach <subject>.