
## 📝 Practice Tasks: Generic Class

### 1. Box with a Boolean

-   Make a `Box<Boolean>` and put `true` inside it.
    
-   Print out the value.
    

Expected output:

`true` 

----------

### 2. Box with a Double

-   Make a `Box<Double>` and put `3.14` inside it.
    
-   Print out the value.
    

Expected output:

`3.14` 

----------

### 3. Box with your Name

-   Make a `Box<String>` and put your name inside.
    
-   Print it out with a message like:
    
    `The box contains: Zorel`

---
## Code:

### Generic class Box:
```java
public class Box <T>{
  T value;

  public void setValue ( T value ) {
    this.value = value;
  }

  public T getValue ( ) {
    return value;
  }
}
```
### Main method:
```java
public class Main {
    public static void main(String[] args) throws Exception {
        Box <Boolean> box1 = new Box<>();
        box1.setValue(true);
        System.out.println(box1.getValue());

        System.out.println();

        Box <Double> box2 = new Box<>();
        box2.setValue(3.14);
        System.out.println(box2.getValue());

        System.out.println();

        Box <String> box3 = new Box<>();
        box3.setValue("Hello World!");
        System.out.println("The box contains: " +box3.getValue());
    }
}
```
