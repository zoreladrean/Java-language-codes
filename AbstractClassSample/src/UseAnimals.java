public class UseAnimals {

  public static void main(String[] args) {
    
    Dog myDog = new Dog();
    Cow myCow = new Cow();
    Snake mySnake = new Snake();

    myDog.setName("My dog Browny");
    myCow.setName("My cow Milky");
    mySnake.setName("My snake Vipey");
    
    System.out.println( myDog.getName()+ " says "); myDog.speak();
    System.out.println( myCow.getName()+ " says "); myCow.speak();
    System.out.println( mySnake.getName()+ " says "); mySnake.speak();
    
  }
}
