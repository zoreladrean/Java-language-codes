# Person and Student Inheritance Example

This activity demonstrates object-oriented programming concepts including inheritance, method overriding, and polymorphism.


### Files
| File | Description |
|------|-------------|
| `Person.java` | Base class with name and age attributes |
| `Student.java` | Subclass that extends Person with grade attribute |
| `Main.java` | Demonstration class with main method |

## Code:

### Person Class:
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
### Student Class:
```java
public class Student extends Person {
  int grade;

  public Student ( String name, int age, int grade ) {
    super ( name, age );
    this.grade = grade;
  }

  public void introduce ( ) {
    System.out.println( "Hi, my name is " + name + " and I am " + age + " years old, and I am in grade " + grade + "." );
  }
}
```
### Main Class:
```java
public class Main {
  public static void main(String[] args) {
    Person p = new Person( "person's name", 30 );
    Student s = new Student("student's name", 17, 12);

    p.introduce();
    s.introduce();
  }
}
```
---
## OOP Concepts Demonstrated

1.  **Inheritance**
    
    -   Student class extends Person class
        
    -   Student inherits name and age properties from Person
        
2.  **Method Overriding**
    
    -   Student class overrides the introduce() method
        
    -   Provides specialized implementation for Students
        
3.  **Polymorphism**
    
    -   Different introduce() implementations based on object type
        
    -   Same method call produces different results
        
4.  **Constructors**
    
    -   Default and parameterized constructors in Person
        
    -   Specialized constructor in Student
---
### Sample Output:
- ![sample output](https://github.com/zoreladrean/Java-language-codes/blob/main/ActivitiesFromChatGPT/InheritancePractice/src/sampleOutput.PNG)