
# Pattern 1
*The pattern goes 1, 4, 7, 10, 13, 16, and so on.*

Given a number, print "**It belongs**" if the given number belongs to the pattern above; otherwise print "**It doesn't belong**".

#### Sample Output  1
```text
Enter number: 7
It belongs
```
#### Sample Output  2
```text
Enter number: 3
It doesn't belong
```
#### Sample Output  3
```text
Enter number: 13
It belongs
```
---
### Code:
```java
import java.util.Scanner;

public class Main {

    public static void main ( String [ ] args ) {

        Scanner scanner = new Scanner ( System.in );

        System.out.print ( "Enter number: " );
        int num = scanner.nextInt ( );

        int i = -2, belongs = 0;

        while ( i < 1000 ) {

            i = i + 3;

            if ( num == i ) {

                System.out.print ( "It belongs" );
                belongs = 1;
                break;
            }
        }

        if ( belongs == 0 )
            System.out.print ( "It doesn't belong" );

        scanner.close ( );
    }
}
```