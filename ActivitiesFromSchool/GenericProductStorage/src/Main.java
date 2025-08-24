import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    
    Scanner s = new Scanner ( System.in );

    System.out.print ( "Test case: " );
    int c = s.nextInt();

    if ( c == 1 )
      test1 ( );
    else
      if ( c == 2 )
        test2 ( );

    s.close();
  }

  public static void test1 ( ) {

    Pen p = new Pen();
    Apple a = new Apple();
    Pineapple pa = new Pineapple();

    System.out.println(p);
    System.out.println(a);
    System.out.println(pa);
  }

  public static void test2 ( ) {

    Pen p = new Pen();
    Apple a = new Apple();
    Pineapple pa = new Pineapple();

    Product <Pen> prP = new Product<>();
    prP.setP(p);
    System.out.println(prP);

    Product <Apple> prA = new Product<>();
    prA.setP(a);
    System.out.println(prA);

    Product <Pineapple> prPa = new Product<>();
    prPa.setP(pa);
    System.out.println(prPa);
  }
}