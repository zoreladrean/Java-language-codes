public class Teacher extends Person {

    String subject;

    public Teacher ( String name, int age, String subject ) {

      super ( name, age );
      this.subject = subject;
    }
    @Override
    public String getRole ( ) {

      return "Teacher";
    }

    @Override
    public void introduce ( ) {
      System.out.println( "Hi, my name is " +name+ ", I am " +age+ " years old. and I teach " +subject+ "." );
    }

}

// In each subclass (Student, Teacher):

// Implement getRole() with the proper value: "Student" or "Teacher".