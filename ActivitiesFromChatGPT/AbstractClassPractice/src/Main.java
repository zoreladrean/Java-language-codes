public class Main {
    
  public static void main ( String [ ] args ) {

      Person [ ] p = new Person [ 3 ];

      p [ 0 ] = new Student ( "Student 1 name", 17, 4 );
      p [ 1 ] = new Student ("Student 2 name", 18, 4);
      p [ 2 ] = new Teacher ( "Name", 30, "Programming" );

      for ( Person person: p ) {

        person.introduce();
        System.out.println ( "Role: " + person.getRole ( ) );
        System.out.println ( );
      }
  }
}


// Activity 7: Abstract Classes

// In Main:

// Loop through the Person[] array again.

// Call both introduce() and getRole() for each person.

// 🔎 Example of what the output might look like:

// Hi, my name is Person's name and I am 30 years old.
// Role: Person

// Hi, my name is Student's name and I am 18 years old, and I am in grade 5.
// Role: Student

// Hi, my name is Teacher's name, I am 30 years old, and I teach Programming.
// Role: Teacher


// Would you like me to give you a starter skeleton for the abstract version of Person, or do you want to try setting it up yourself first?