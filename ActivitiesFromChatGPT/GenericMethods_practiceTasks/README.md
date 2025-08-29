
## 📝 Task 1: Echo Method

Make a generic method that takes one parameter and just prints it.

Example:

`echo("Hello"); // prints: Hello echo(123); // prints: 123` 

👉 Hint:

`public  static <T> void  echo(T value) {
    System.out.println(value);
}` 

----------

## 📝 Task 2: Array Printer

Make a generic method that takes an **array of any type** and prints each element.

Example:

`Integer[] numbers = {1, 2, 3};
printArray(numbers); // Output:  // 1  // 2  // 3` 

👉 Hint:

`public  static <T> void  printArray(T[] array) { for (T element : array) {
        System.out.println(element);
    }
}` 

----------

## 📝 Task 3: Return Generic

Make a generic method that **returns** what you give it.

Example:

`String  s  = giveBack("Hello"); Integer  n  = giveBack(100);` 

👉 Hint:

`public  static <T> T giveBack(T value) { return value;
}` 

----------

⚡ Try writing these in a `Main` class and running them.

---
## Code:
```java
public class Main {
    public static void main(String[] args) throws Exception {
        echo(true);
        echo("Hello World!");
        echo(123456);
        echo(3.1416);

        System.out.println();

        Integer[] numbers = { 1, 2, 3 };
        String[] fruits = { "Apple", "Banana", "Citrus" };
        Boolean[] bools = { true, false };
        Double[] numbers2 = { 1.2, 2.3, 3.4 };

        printArray(numbers);
        printArray(fruits);
        printArray(bools);
        printArray(numbers2);

        System.out.println();

        String s = "hello world!";
        Integer n = 13579;
        Double d = 123.456;
        Boolean b = false;

        System.out.println("return "+returnsBack(s));
        System.out.println("return "+returnsBack(n));
        System.out.println("return "+returnsBack(d));
        System.out.println("return "+returnsBack(b));

    }

    public static <T> void echo ( T value ) {
        System.out.println(value);
    }

    public static <T> void printArray ( T[] value ) {
        for ( int i = 0; i < value.length; i++ ) {
            System.out.println(value[i]);
        }
    }

    public static <T> T returnsBack ( T value ) {
        return value;
    }
}

```