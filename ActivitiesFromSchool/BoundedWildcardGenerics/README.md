
# Bounded Wildcard Generics


-   Create a class  `ListHelper`. Create  `public`and  `static`methods within this class:  
    -   `void displayList(ArrayList<---> list)`- display each item of list per line. Use wildcard so that it may accept any types of ArrayList.

    -   `void listWalk(ArrayList<---> list)`- call the  `walk()`  method for each item on the list. Use a  **bounded wildcard**  such that it can  **consume**  `**class Person**`and its superclasses.

    -   `void listShoot(ArrayList<---> list)`- call the  `shoot()`  method for each item on the list. Use a  **bounded wildcard**  such that it can  **consume**  `**class Army**`and its superclasses.

    -   `void listStudy(ArrayList<---> list)`- call the  `study()`method for each item on the list. Use a  **bounded wildcard**  such that it can  **consume**  `**class Student**`and its superclasses.

    -   `void listDoArt(ArrayList<---> list)`- call the  `doArt()`  method for each item on the list. Use a  **bounded wildcard**  such that it can  **consume**  `**class ArtMajor**`and its superclasses.

    -   `void listCode(ArrayList<---> list)`- call the  `code()`method for each item on the list. Use a  **bounded wildcard**  such that it can  **consume**  `**class CCS**`and its superclasses.

    -   `<T --- ---> void addPersonToList(ArrayList<---> list, T t)`  - a  **generic method**  with type  `T`  that can be  `Person`or it's subclasses. Adds item  `t`  to the  `ArrayList`  with a  **bounded wildcard.**

Consider the relationship of the classes:
- ![relationship of the classes]()
---
- ### Sample Output  1
```text
What to do:
1. Consume Person
2. Consume Army
3. Consume Student
4. Consume Art Major
5. Consume CCS
6. Produce Person
7. Display List of Integer
Choice: 1
AA is walking...
BB is walking...
CC is walking...
AA
BB
CC
```

- ### Sample Output  2
```text
What to do:
1. Consume Person
2. Consume Army
3. Consume Student
4. Consume Art Major
5. Consume CCS
6. Produce Person
7. Display List of Integer
Choice: 2
DD is walking...
EE is walking...
FF is walking...
DD is shooting...
EE is shooting...
FF is shooting...
DD
EE
FF
```

- ### Sample Output  3
```text
What to do:
1. Consume Person
2. Consume Army
3. Consume Student
4. Consume Art Major
5. Consume CCS
6. Produce Person
7. Display List of Integer
Choice: 3
GG is walking...
HH is walking...
II is walking...
GG is studying...
HH is studying...
II is studying...
GG
HH
II
```
---
## Codes: 
### Class ListHelper:
```java
import java.util.ArrayList;

public class ListHelper {

  public static  void displayList ( ArrayList < ? > list ) {
    for ( int i = 0; i < list.size ( ); i++ )
      System.out.println ( list.get ( i ) );
  }

  public static void listWalk ( ArrayList < ? extends Person > list ) {
    for ( int i = 0; i < list.size ( ); i++ )
      list.get ( i ).walk ( );
  }

  public static void listShoot ( ArrayList < ? extends Army > list ) {
    for ( int i = 0; i < list.size ( ); i++ )
      list.get ( i ).shoot ( );
  }

  public static void listStudy ( ArrayList < ? extends Student > list ) {
    for ( int i = 0; i < list.size ( ); i++ )
      list.get ( i ).study ( );
  }

  public static void listDoArt ( ArrayList < ? extends ArtMajor > list ) {
    for ( int i = 0; i < list.size ( ); i++ )
      list.get ( i ).doArt ( );
  }

  public static void listCode ( ArrayList < ? extends CCS > list ) {
    for ( int i = 0; i < list.size ( ); i++ )
      list.get ( i ).code ( );
  }

  public static < T extends Person > void addPersonToList ( ArrayList < ? super Person > list, T t ) {
    list.add ( t );
  }
}
```
---
### Main method:
```java
import java.util.*;

public class Main {

    public static void main ( String args [ ] ) {

        Scanner s = new Scanner ( System.in );

        ArrayList < Person > pList = new ArrayList < > ( );
        pList.add ( new Person ( "AA" ) );
        pList.add ( new Person ( "BB" ) );
        pList.add ( new Person ( "CC" ) );

        ArrayList < Army > aList = new ArrayList < > ( );
        aList.add ( new Army ( "DD" ) );
        aList.add ( new Army ( "EE" ) );
        aList.add ( new Army ( "FF" ) );

        ArrayList < Student > sList = new ArrayList < > ( );
        sList.add ( new Student ( "GG" ) );
        sList.add ( new Student ( "HH" ) );
        sList.add ( new Student ( "II" ) );

        ArrayList < ArtMajor > amList = new ArrayList < > ( );
        amList.add ( new ArtMajor ( "JJ" ) );
        amList.add ( new ArtMajor ( "KK" ) );
        amList.add ( new ArtMajor ( "LL" ) );

        ArrayList < CCS > ccsList = new ArrayList < > ( );
        ccsList.add ( new CCS ( "MM" ) );
        ccsList.add ( new CCS ( "NN" ) );
        ccsList.add ( new CCS ( "OO" ) );

        int input = 0;
        System.out.println ( "What to do: " );
        System.out.println ( "1. Consume Person" );
        System.out.println ( "2. Consume Army" );
        System.out.println ( "3. Consume Student" );
        System.out.println ( "4. Consume Art Major" );
        System.out.println ( "5. Consume CCS" );
        System.out.println ("6. Produce Person" );
        System.out.println ( "7. Display List of Integer" );
        System.out.print ( "Choice: " );
        input = s.nextInt ( );

        switch ( input ) {

            case 1:
                ListHelper.listWalk ( pList );
                ListHelper.displayList ( pList );
                break;

            case 2:
                ListHelper.listWalk ( aList );
                ListHelper.listShoot ( aList );
                ListHelper.displayList ( aList );
                break;

            case 3:
                ListHelper.listWalk ( sList );
                ListHelper.listStudy ( sList );
                ListHelper.displayList ( sList );
                break;

            case 4:
                ListHelper.listWalk ( amList );
                ListHelper.listStudy ( amList );
                ListHelper.listDoArt ( amList );
                ListHelper.displayList ( amList );
                break;

            case 5:
                ListHelper.listWalk ( ccsList );
                ListHelper.listStudy ( ccsList );
                ListHelper.listCode ( ccsList );
                ListHelper.displayList ( ccsList );
                break;

            case 6:
                ListHelper.addPersonToList ( pList, new Person ( "John" ) );
                ListHelper.addPersonToList ( pList, new Army ( "Mary" ) );
                ListHelper.addPersonToList ( pList, new Student ( "Josh" ) );
                ListHelper.addPersonToList ( pList, new ArtMajor ( "Fleur" ) );
                ListHelper.addPersonToList ( pList, new CCS ( "Bogart" ) );
                ListHelper.displayList ( pList );
                break;

            case 7:
                ArrayList < Integer > list = new ArrayList < > ( );
                list.add ( 1 );
                list.add ( 2 );
                list.add ( 3 );
                ListHelper.displayList ( list );
                break;
        }

        s.close ( );
    }
}
```
---
### Other classes:
```java
public class Person {
  protected String name;

  public Person ( String name ) {
    this.name = name;
  }

  public void setName ( String name ) {
    this.name = name;
  }

  public String getName ( ) {
    return name;
  }

  public void walk ( ) {
    System.out.println ( name + " is walking..." );
  }
  
  @Override
  public String toString ( ) {
    return name;
  }
}
```
```java
public class Army extends Person {

  public Army ( String name ) {
    super ( name );
  }

  public void shoot ( ) {
    System.out.println ( name + " is shooting..."  );
  }
}
```
```java
public class Student extends Person {
  
  public Student ( String name ) {
    super ( name );
  }

  public void study ( ) {
    System.out.println ( name + " is studying..." );
  }
}
```
```java
public class ArtMajor extends Student {

  public ArtMajor ( String name ) {
    super ( name );
  }

  public void doArt ( ) {
    System.out.println ( name + " is doing Art..." );
  }
}
```
```java
public class CCS extends Student {

  public CCS ( String name ) {
    super ( name );
  }

  public void code ( ) {
    System.out.println ( name + " is coding..." );
  }
}
```