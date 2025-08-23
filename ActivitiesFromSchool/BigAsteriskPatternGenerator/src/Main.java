import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner ( System.in );

        int height;

        do {
            System.out.print ( "Enter the height of the asterisk: " );
            height = input.nextInt();

            if ( height < 4 )
                System.out.println ( "Value must be 4 and above." );
        } while ( height < 4 );

        int half = height / 2;

        upperPart(half);
        middlePart(half);
        lowerPart(half);

        input.close();
    }

    public static void upperPart ( int half ) {

        for ( int  i = 0; i < half; i++ ) {

            for ( int j = 0; j < i; j++ )
                System.out.print ( " " );
            System.out.print ( "*" );

            for ( int j = 0; j < ( half - i - 1 ); j++ )
                System.out.print ( " " );
            System.out.print ( "*" );

            for ( int j = 0; j < ( half - i - 1 ); j++ )
                System.out.print ( " " );
            System.out.println ( "*" );
        }
    }

    public static void middlePart ( int half ) {
        
        for ( int i = 0; i < ( half * 2 + 1 ); i++ )
            System.out.print ( "*" );
        
        System.out.println ( );
    }

    public static void lowerPart ( int half ) {

        for ( int i = half - 1; i >= 0; i-- ) {

            for ( int j = 0; j < i; j++ )
                System.out.print ( " " );
            System.out.print ( "*" );

            for ( int j = 0; j < ( half - i - 1 ); j++ )
                System.out.print ( " " );
            System.out.print ( "*" );

            for ( int j = 0; j < ( half - i - 1 ); j++ )
                System.out.print ( " " );
            System.out.println( "*" );
        }
    }
}
