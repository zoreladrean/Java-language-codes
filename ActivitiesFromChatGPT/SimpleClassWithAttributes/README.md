
# Book Class Implementation

A Java class demonstrating fundamental object-oriented programming concepts through a simple book management system.

##  Class Structure

### Attributes
- `title` (String): Title of the book
- `author` (String): Author of the book
- `year` (int): Publication year

### Constructors
1. **Default Constructor**  
   `public Book()`  
   Creates a book with null/default values
   
2. **Parameterized Constructor**  
   `public Book(String title, String author, int year)`  
   Initializes all attributes

### Methods
| Method | Parameters | Return Type | Description |
|--------|------------|-------------|-------------|
| `displayInfo()` | None | `void` | Prints book details to console |
| `wasPublishedAfter()` | `int year` | `boolean` | Checks if published after specified year |
| `updateYear()` | `int newYear` | `void` | Updates publication year |

##  Main Method Demonstration
The `main()` method demonstrates:
1. Creating book objects using both constructors
2. Displaying book information
3. Checking publication dates
4. Updating book year and re-verifying

---
### Main method:
```java
  public static void main(String[] args) {
    
    Book book1 = new Book ();
    book1.title = "This is the title.";
    book1.author = "This is the author.";
    book1.year = 2024;

    Book book2 = new Book();
    book2.title = "This is another book.";
    book2.author = "This is another author.";
    book2.year = 2025;

    book1.displayInfo();

    System.out.println();
    System.out.println();

    book2.displayInfo();
    
    System.out.println();
    System.out.println();

    System.out.println ( "Is book1 published after 2020?: " + book1.wasPublishedAfter(2020) );

    System.out.println();
    System.out.println();

    System.out.println ("Let's update the year of book1 to 2019." );
    book1.updateYear(2019);

    System.out.println();
    System.out.println();

    System.out.println ( "Is book1 published after 2020?: " + book1.wasPublishedAfter(2020) );
  }
```
### Class Book:
```java
public class Book {

  public String title;
  public String author;
  public int year;

  public Book () {

  }

  public Book ( String title, String author, int year ) {
    this.title = title;
    this.author = author;
    this.year = year;
  }

  public void displayInfo ( ) {
    System.out.println ( "Title: " +title );
    System.out.println ( "Author: " +author );
    System.out.print ( "Year: " +year );
  }

  public boolean wasPublishedAfter ( int year ) {
    return this.year > year;
  }

  public void updateYear ( int newYear ) {
    this.year = newYear;
  }
}
```
---
### Sample Output:
- ![sample output](https://github.com/zoreladrean/Java-language-codes/blob/main/ActivitiesFromChatGPT/SimpleClassWithAttributes/sampleOutput.PNG)