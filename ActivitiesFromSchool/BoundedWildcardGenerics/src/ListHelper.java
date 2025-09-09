import java.util.ArrayList;

public class ListHelper {

  public static  void displayList ( ArrayList < ? > list ) {
    for ( int i = 0; i < list.size ( ); i++ )
      System.out.println ( list.get ( i ) );
  }

  public static void listWalk ( ArrayList < ? extends Person > list ) {
    for ( int i = 0; i < list.size ( ); i++ )
      list.get ( i ).walk ( );
  }

  public static void listShoot ( ArrayList < ? extends Army > list ) {
    for ( int i = 0; i < list.size ( ); i++ )
      list.get ( i ).shoot ( );
  }

  public static void listStudy ( ArrayList < ? extends Student > list ) {
    for ( int i = 0; i < list.size ( ); i++ )
      list.get ( i ).study ( );
  }

  public static void listDoArt ( ArrayList < ? extends ArtMajor > list ) {
    for ( int i = 0; i < list.size ( ); i++ )
      list.get ( i ).doArt ( );
  }

  public static void listCode ( ArrayList < ? extends CCS > list ) {
    for ( int i = 0; i < list.size ( ); i++ )
      list.get ( i ).code ( );
  }

  public static < T extends Person > void addPersonToList ( ArrayList < ? super Person > list, T t ) {
    list.add ( t );
  }

}
