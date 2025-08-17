public class Book {

  // Activity 1: Simple Class with Attributes
  // Create a Book class with:
  // Attributes: title, author, year
  // A method displayInfo() that prints the details.
  // In Main, create 2 books and print their info.
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

  // Activity 2: Method with Parameters
  // In your Book class, add a method called wasPublishedAfter(int year).
  // It should return true if the book’s year is greater than the given year, otherwise false.
  // In Main, create two books and test this method with a year of your choice.
  // Hint: Use this.year > year.

  public boolean wasPublishedAfter ( int year ) {
    return this.year > year;
  }

  // Activity 3: Method that Updates an Attribute
  // In your Book class, add a method called updateYear(int newYear).
  // It should set the book’s year attribute to the newYear provided.
  // In Main, create one book, display its info, call updateYear(...), then display again.
  // Hint: Use this.year = newYear;.

  public void updateYear ( int newYear ) {
    this.year = newYear;
  }

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

}