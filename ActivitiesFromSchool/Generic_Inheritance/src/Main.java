import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);

    System.out.print( "Enter type: " );
    String type = s.nextLine();

    switch ( type ) {
      case "String":
        System.out.print( "Input: " );
        stringTest ( s.nextLine() );
        break;

      case "Integer":
        System.out.print( "Input: " );
        interegerTest ( s.nextInt() );
        break;

      case "Float":
        System.out.print( "Input: " );
        floatTest ( s.nextFloat() );
        break;

      case "Object":
        objectTest( new Object() );
        break;

      default:
        System.out.println("Options: String, Integer, Float, and Object only.");
        break;
    }

    s.close();
  }

  public static void stringTest ( String s ) {
    DataHandler <String> dh = new  DataHandler<>();
    dh.setT( s );

    System.out.println( "Type held: " + dh.getT().getClass() );
    System.out.println( "Value held: " + dh.getT() );

    s = dh.handleData();

    System.out.println( "Handling dummy data: \"Burst fade to ya?\"" );

    dh.handle("Burst fade to ya?" );

    System.out.println( "Value held: " + dh.getT() );
  }

  public static void interegerTest ( Integer i ) {
    DataHandler <Integer> dh = new  DataHandler<>();
    dh.setT( i );

    System.out.println( "Type held: " + dh.getT().getClass() );
    System.out.println( "Value held: " + dh.getT() );

    i = dh.handleData();

    System.out.println( "Handling dummy data: 420" );

    dh.handle(420 );

    System.out.println( "Value held: " + dh.getT() );
  }

  public static void floatTest ( Float f ) {
    DataHandler <Float> dh = new  DataHandler<>();
    dh.setT( f );

    System.out.println( "Type held: " + dh.getT().getClass() );
    System.out.println( "Value held: " + dh.getT() );

    f = dh.handleData();

    System.out.println( "Handling dummy data: 3.14f" );

    dh.handle(3.14f );

    System.out.println( "Value held: " + dh.getT() );
  }

  public static void objectTest ( Object o ) {
    DataHandler <Object> dh = new  DataHandler<>();
    dh.setT( o );

    System.out.println( "Type held: " + dh.getT().getClass() );
    System.out.println( "Value held: " + dh.getT() );

    o = dh.handleData();

    System.out.println( "Handling dummy data: DataHandler <Object>" );

    dh.handle( dh );

    System.out.println( "Value held: " + dh.getT() );
  }

}
