# Jagged Array Creation


**Write a program that asks how many rows of arrays for input and for each array, ask how many elements. Also, ask the elements for each array in the jagged array. Print each row in the jagged array after.** 

### Sample Output  1
```text
Enter the number of rows in the jagged array: 2
Enter the number of elements in row 1: 3
Enter 3 elements for row 1: 11 7 6
Enter the number of elements in row 2: 4
Enter 4 elements for row 2: 5 13 10 8
Jagged Array:
Row 1: 11 7 6
Row 2: 5 13 10 8
```
### Sample Output  2
```text
Enter the number of rows in the jagged array: 2
Enter the number of elements in row 1: 2
Enter 2 elements for row 1: 50 30
Enter the number of elements in row 2: 3
Enter 3 elements for row 2: 40 20 60
Jagged Array:
Row 1: 50 30
Row 2: 40 20 60
```
### Sample Output  3
```text
Enter the number of rows in the jagged array: 3
Enter the number of elements in row 1: 4
Enter 4 elements for row 1: 15 20 10 30
Enter the number of elements in row 2: 3
Enter 3 elements for row 2: 50 40 60
Enter the number of elements in row 3: 2
Enter 2 elements for row 3: 25 35
Jagged Array:
Row 1: 15 20 10 30
Row 2: 50 40 60
Row 3: 25 35
```
### Code:
```java
import java.util.Scanner;

public class Main {
    public static void main ( String [ ] args ) {
        
        Scanner scanner = new Scanner ( System.in );
        
        System.out.print ( "Enter the number of rows in the jagged array: " );
        int numOfRows = scanner.nextInt();
        int col;
        
        int [ ] [ ] matrix = new int [ numOfRows ] [ ];
        
        for ( int i = 0; i < numOfRows; i++ ) {
        
            System.out.printf ( "Enter the number of elements in row %d: ", i+1 );
            col = scanner.nextInt();
            
            matrix[i] = new int[col];
            
            System.out.printf ( "Enter %d elements for row %d: ", col, i+1 );
            for ( int j = 0; j < col; j++ ) {
                matrix [ i ] [ j ] = scanner.nextInt();
            }
                
        }
        
        System.out.println ( "Jagged Array:" );
        
        for ( int i = 0; i < numOfRows; i++ ) {
            System.out.printf ( "Row %d: ", i + 1 );
            
            for ( int j = 0; j < matrix [ i ].length; j++ ) {
                System.out.print ( matrix [ i ] [ j ] + " " );
            }
            
            System.out.println ( );
        }
        
        scanner.close();
    }
}
```