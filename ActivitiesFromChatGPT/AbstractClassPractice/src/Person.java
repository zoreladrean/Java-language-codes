public abstract class Person {

  String name;
  int age;

  public Person ( String name, int age ) {

    this.name = name;
    this.age = age;
  }

  public abstract String getRole ( );

  public void introduce ( ) {

    System.out.println ( "Hi, my name is " + name + " and I am " + age + " years old." );
  }
}

// Activity 7: Abstract Classes

// We’re going to use your existing Person structure, but make it more flexible.

// Instructions:

// Make Person an abstract class.

// Add an abstract method getRole() that returns a String.

// Keep the introduce() method non-abstract (so all subclasses still inherit the default version).

