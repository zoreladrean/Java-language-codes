public class WorkingDog extends Dog implements Worker {

  private int hourOfTraining;

  public void setHoursOfTraining ( int hourOfTraining ) {

    this.hourOfTraining = hourOfTraining;
  }

  public int getHoursOfTraining ( ) {

    return hourOfTraining;
  }

  public void work ( ) {

    speak ( );
    System.out.println ( "I am a dog who works" );
    System.out.println ( "I have " + hourOfTraining + " hours of professional training!" );
  }
}
