public class Rectangle extends Shape {
  double length;
  double width;

  public Rectangle ( double length, double width ) {
    this.length = length;
    this.width = width;
  }

  public double area ( ) {
    return ( length * width );
  }

  public double perimeter ( ) {
    return ( 2 * ( length + width ) );
  }

  public double diameter ( ) {
    return ( Math.sqrt( ( length * length ) + ( width * width ) ) );
  }
}
