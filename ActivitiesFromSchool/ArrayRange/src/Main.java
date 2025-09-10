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