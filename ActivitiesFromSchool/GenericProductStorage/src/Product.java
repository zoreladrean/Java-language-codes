class Product <P> {
  private P p;

  public P getP ( ) {
    return p;
  }

  public void setP ( P p ) {
    this.p = p;
  }

  @Override
  public String toString ( ) {
    return String.format( p.getClass() + ": " + p.toString() );
  }
}





