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