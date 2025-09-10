
# Array Range

**A range is defined by the difference of the largest element and the smallest element.**

Given a number of items, output the range of the set of elements. Consider the elements to contain decimal numbers.

> Example: Given the array of numbers 15, 94, 25, 6, 72, 51, the range is 88 since that is the difference between the largest (94) and the smallest (6) number in the array.

 #### Sample Output  1
```text
Number of elements: 6
Enter 6 elements: 15 94 25 6 72 51
The range is 88.00
```

 #### Sample Output  2
```text
Number of elements: 4
Enter 4 elements: 15.5 17.3 18.2 19.1
The range is 3.60
```
#### Sample Output  3
```text
Number of elements: 7
Enter 7 elements: 51 94 35 25 12 14 98.2
The range is 86.20
```
---
### Code:
```java
import java.util.Scanner;

public class Main {
    
  public static void main ( String [ ] args ) {

    Scanner scanner = new Scanner ( System.in );

    int size;

    System.out.print ( "Number of elements: " );
    size = scanner.nextInt ( );

    double [ ] arr =  new double [ size ];

    System.out.print ( "Enter " + size + " elements: " );

    for ( int i = 0; i < size; i++ )
      arr [ i ] = scanner.nextDouble ( );

      double min = arr [ 0 ];
      double max = arr [ 0 ];

      for ( double i: arr ) {

        if ( min > i )
          min = i;
        
        if ( max < i )
          max = i;
      }

      double range = max - min;

      System.out.printf ( "The range is %.2f", range );

      scanner.close ( );
  }
}
```