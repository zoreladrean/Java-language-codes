import java.util.*;

public class Main {

    public static void main ( String args [ ] ) {

        Scanner s = new Scanner ( System.in );

        ArrayList < Person > pList = new ArrayList < > ( );
        pList.add ( new Person ( "AA" ) );
        pList.add ( new Person ( "BB" ) );
        pList.add ( new Person ( "CC" ) );

        ArrayList < Army > aList = new ArrayList < > ( );
        aList.add ( new Army ( "DD" ) );
        aList.add ( new Army ( "EE" ) );
        aList.add ( new Army ( "FF" ) );

        ArrayList < Student > sList = new ArrayList < > ( );
        sList.add ( new Student ( "GG" ) );
        sList.add ( new Student ( "HH" ) );
        sList.add ( new Student ( "II" ) );

        ArrayList < ArtMajor > amList = new ArrayList < > ( );
        amList.add ( new ArtMajor ( "JJ" ) );
        amList.add ( new ArtMajor ( "KK" ) );
        amList.add ( new ArtMajor ( "LL" ) );

        ArrayList < CCS > ccsList = new ArrayList < > ( );
        ccsList.add ( new CCS ( "MM" ) );
        ccsList.add ( new CCS ( "NN" ) );
        ccsList.add ( new CCS ( "OO" ) );

        int input = 0;
        System.out.println ( "What to do: " );
        System.out.println ( "1. Consume Person" );
        System.out.println ( "2. Consume Army" );
        System.out.println ( "3. Consume Student" );
        System.out.println ( "4. Consume Art Major" );
        System.out.println ( "5. Consume CCS" );
        System.out.println ("6. Produce Person" );
        System.out.println ( "7. Display List of Integer" );
        System.out.print ( "Choice: " );
        input = s.nextInt ( );

        switch ( input ) {

            case 1:
                ListHelper.listWalk ( pList );
                ListHelper.displayList ( pList );
                break;

            case 2:
                ListHelper.listWalk ( aList );
                ListHelper.listShoot ( aList );
                ListHelper.displayList ( aList );
                break;

            case 3:
                ListHelper.listWalk ( sList );
                ListHelper.listStudy ( sList );
                ListHelper.displayList ( sList );
                break;

            case 4:
                ListHelper.listWalk ( amList );
                ListHelper.listStudy ( amList );
                ListHelper.listDoArt ( amList );
                ListHelper.displayList ( amList );
                break;

            case 5:
                ListHelper.listWalk ( ccsList );
                ListHelper.listStudy ( ccsList );
                ListHelper.listCode ( ccsList );
                ListHelper.displayList ( ccsList );
                break;

            case 6:
                ListHelper.addPersonToList ( pList, new Person ( "John" ) );
                ListHelper.addPersonToList ( pList, new Army ( "Mary" ) );
                ListHelper.addPersonToList ( pList, new Student ( "Josh" ) );
                ListHelper.addPersonToList ( pList, new ArtMajor ( "Fleur" ) );
                ListHelper.addPersonToList ( pList, new CCS ( "Bogart" ) );
                ListHelper.displayList ( pList );
                break;

            case 7:
                ArrayList < Integer > list = new ArrayList < > ( );
                list.add ( 1 );
                list.add ( 2 );
                list.add ( 3 );
                ListHelper.displayList ( list );
                break;
        }

        s.close ( );
    }
}