
# Basic Shape Inheritance

Implement the  `Shape`  class which has the following methods:

-   `double area()`
-   `double perimeter()`

Create three subclasses for the Shape called Circle, Rectangle, and Triangle.

1.  The class Circle has a property  `double radius`. Implement the inherited methods using the formula of getting the area and perimeter/circumference of a circle.
2.  The class Rectangle has a property  `double length`  and  `double width`. Implement the inherited methods using the formula of getting the area and perimeter of a rectangle. Add a method called  `diameter()`  which returns the length of the diameter of a rectangle.
3.  The class Triangle has the properties  `double a`,  `double b,`  nd`double c`. Implement the inherited methods using the formula of getting the area and perimeter of a triangle. In getting the area, use Heron's formula.

**Heron's Formula:**  s = (a+b+c)/2, Area = √(s(s−a)(s−b)(s−c))

In the main, ask the user for the following details:

-   `Shape`(1 for Circle, 2 for Rectangle, 3 for Triangle)
-   `Dimensions`(Shape-specific)

Create an object from the appropriate class based on the user input and name it  `someShape`  .

From here, call the  `area()`  method and  `perimeter()`  method of the shape class and print them with two decimal places like this:

```text
Area of the shape: {area}
Perimeter of the shape: {perimeter}


```

If the someShape is a Rectangle call the method  `diameter()`  and print the diameter like this:

```text
Diameter of the shape: {diameter}
```
---
### Sample Outputs: 
- ![sample output 1]()
- ![sample output 2]()
- ![sample output 3]()