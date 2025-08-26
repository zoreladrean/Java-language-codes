class DataHandler <T> extends Storage <T> implements Handler <T> {

  public T handle ( T t ) {
    this.t =t;
    System.out.println( "Processing: " + t.toString() );
    return t;
  }

  public T handleData ( ) {
    System.out.println( "Processing: " + t.toString() );
    return t;
  }
}
