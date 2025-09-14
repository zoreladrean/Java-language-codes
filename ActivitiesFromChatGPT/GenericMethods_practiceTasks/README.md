
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
---
### Java Generics Concepts Demonstrated

#### 1. Generic Methods

-   Methods that can operate on different types while maintaining type safety
    
-   Type parameter `<T>` declared before return type
    
-   Compile-time type checking prevents ClassCastException
    

#### 2. Three Types of Generic Methods

1.  **echo(T value)** - Consumes a parameter and performs an operation
    
2.  **printArray(T [ ] value)** - Works with arrays of any type
    
3.  **returnsBack(T value)** - Returns a value of the same type (identity function)
    

#### 3. Type Inference

-   Java automatically infers the type parameter from method arguments
    
-   No need to explicitly specify types when calling methods
    

#### 4. Bounded vs Unbounded Generics

-   These examples use unbounded type parameters `<T>`
    
-   Could be extended with bounded parameters: `<T extends Number>`
    
---
### Method Syntax

```java

// Generic method syntax
public static <TypeParameter> returnType methodName(parameters) {
    // method body
}
```

### Benefits Demonstrated

1.  **Type Safety**: Compile-time checking prevents type errors
    
2.  **Code Reusability**: Single method works with multiple types
    
3.  **Eliminates Casting**: No need for explicit type casting
    
4.  **Cleaner Code**: More readable and maintainable