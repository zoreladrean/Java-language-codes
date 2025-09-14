
# Abstract Person Hierarchy with Polymorphism

This Java project demonstrates object-oriented programming concepts including abstract classes, polymorphism, method overriding, and abstract method implementation.

### Project Structure

#### Class Hierarchy
```text
Person (Abstract Base Class)  
├── Student (Concrete Subclass)  
└── Teacher (Concrete Subclass)
```


### Files
| File | Description |
|------|-------------|
| `Person.java` | Abstract base class with name, age, and abstract getRole() |
| `Student.java` | Concrete subclass representing a student with grade attribute |
| `Teacher.java` | Concrete subclass representing a teacher with subject attribute |
| `Main.java` | Demonstration class showcasing polymorphism with abstract classes |

### Code Overview:

#### Abstract Person Class
```java
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
```

#### Student Class

```java
public class Student extends Person {

  int grade;

  public Student ( String name, int age, int grade ) {
    
    super ( name, age );
    this.grade = grade;
  }

  public String getRole ( ) {
    
    return "Student";
  }

  @Override
  public void introduce ( ) {

    System.out.println ( "Hi, my name is " + name + " and I am " + age + " years old, and I am in grade " +grade+ "." );
  }
}
```

#### Teacher Class

```java
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
```

#### Main Class

```java
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
```
---
### Expected Output:

```text
Hi, my name is Student 1 name and I am 17 years old, and I am in grade 4.
Role: Student

Hi, my name is Student 2 name and I am 18 years old, and I am in grade 4.
Role: Student

Hi, my name is Name, I am 30 years old. and I teach Programming.
Role: Teacher
```
---

### Advanced OOP Concepts Demonstrated:

1.  **Abstract Classes**
    
    -   Person class is declared abstract
        
    -   Contains both concrete and abstract methods
        
    -   Cannot be instantiated directly
        
2.  **Abstract Methods**
    
    -   getRole() method is abstract in Person
        
    -   Must be implemented by all subclasses
        
    -   Ensures consistent interface across subclasses
        
3.  **Polymorphism**
    
    -   Person array holding different subclass objects
        
    -   Same method calls produce different results
        
    -   Runtime method binding
        
4.  **Method Overriding**
    
    -   All subclasses override both introduce() and getRole() methods
        
    -   Specialized implementations for each subclass
        
5.  **Constructor Chaining**
    
    -   Use of super() to call parent constructor
        
    -   Proper initialization order
---
### 💡 Key Takeaways

1.  Abstract classes can't be instantiated but provide common structure
    
2.  Abstract methods ensure subclasses implement specific behavior
    
3.  Polymorphism allows treating objects of different classes uniformly
    
4.  Method overriding enables specialized behavior in subclasses
---
_"Abstraction is one of the key concepts of object-oriented programming (OOP) languages. Its main goal is to handle complexity by hiding unnecessary details from the user."_ - Oracle Java Documentation