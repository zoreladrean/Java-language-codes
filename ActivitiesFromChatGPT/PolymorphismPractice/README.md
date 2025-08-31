# Person, Student, and Teacher Polymorphism Project

## Person Inheritance Hierarchy

This activity demonstrates object-oriented programming concepts including inheritance, polymorphism, method overriding, and array handling with different subclasses.

##  Project Structure

### Class Hierarchy

Person (Base Class)  
├── Student (Subclass)  
└── Teacher (Subclass)

### Files
| File | Description |
|------|-------------|
| `Person.java` | Base class with name and age attributes |
| `Student.java` | Subclass representing a student with grade attribute |
| `Teacher.java` | Subclass representing a teacher with subject attribute |
| `Main.java` | Demonstration class showcasing polymorphism |

## Code:

### Person Class
```java
public class Person {
  String name;
  int age;

  public Person ( ) {

  }

  public Person ( String name, int age ) {
    this.name = name;
    this.age = age;
  }

  public void introduce ( ) {
    System.out.println( "Hi, my name is " + name + " and I am " + age + " years old." );
  }
}
```
### Student Class
```java
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
```
### Teacher Class
```java
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
```
### Main Class
```java
public class Main {
    public static void main(String[] args) throws Exception {
        Person [ ] p = new Person[3];

        p[0] = new Person("Person's name", 30);
        p[1] = new Student("Student's name", 18, 5);
        p[2] = new Teacher("Programming", "Teacher's name", 30);

        for ( int i = 0; i < p.length; i++ )
            p[i].introduce();

    }
}
```

##  Expected Output

```text
Hi, my name is Person's name and I am 30 years old.
Hi, my name is Student's name and I am 18 years old, and I am in grade 5.
Hi, my name is Teacher's name, I am 30 years old, and I teach Programming.
```