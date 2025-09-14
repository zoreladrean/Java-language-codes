import java.util.Scanner;

public class Main {

    public static void main ( String [ ] args ) {

        Scanner scanner = new Scanner ( System.in );

        System.out.print ( "Enter the number of rows in the jagged array: " );
        int numOfRows = scanner.nextInt ( );

        int col;

        int [ ] [ ] matrix = new int [ numOfRows ] [ ];

        for ( int i = 0; i < numOfRows; i++ ) {

            System.out.printf ( "Enter the number of elements in row %d: ", i + 1 );
            col = scanner.nextInt ( );

            matrix [ i ] = new int [ col ];

            System.out.printf ( "Enter %d elements for row %d: ", col, i + 1 );

            for ( int j = 0; j < col; j++ )
                matrix [ i ] [ j ] = scanner.nextInt ( );
        }

        System.out.println ( "Jagged Array:" );

        for ( int i = 0; i < numOfRows; i++ ) {

            System.out.printf ( "Row %d: ", i + 1 );

            for ( int j = 0; j < matrix [ i ].length; j++ )
                System.out.print ( matrix [ i ] [ j ] + " " );

            System.out.println ( );
        }

        scanner.close ( );
    }
}