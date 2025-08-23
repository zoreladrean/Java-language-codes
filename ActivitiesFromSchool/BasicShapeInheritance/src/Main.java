import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter shape (1 - Circle, 2 - Rectangle, 3 - Triangle): ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter radius: ");
                double radius = input.nextDouble();
                Circle circle = new Circle (radius);

                System.out.println("Area of the shape: " +String.format("%.2f", circle.area()));
                System.out.println("Perimeter of the shape: "  +String.format("%.2f", circle.perimeter()));
                System.out.print("SUCCESS");
                break;
            
            case 2:
                System.out.print( "Enter length: " );
                double length = input.nextDouble();
                System.out.print( "Enter width: " );
                double width = input.nextDouble();

                Rectangle rectangle = new Rectangle(length, width);

                System.out.println( "Area of the shape: " +String.format("%.2f", rectangle.area ( ) ) );
                System.out.println( "Perimeter of the shape: " +String.format("%.2f", rectangle.perimeter ( ) ) );
                System.out.println( "Diameter of the shape: " +String.format("%.2f", rectangle.diameter ( ) ) );
                System.out.print("SUCCESS");
                break;

            case 3:
                System.out.print ( "Enter a: " );
                double a = input.nextDouble();
                System.out.print ( "Enter b: " );
                double b = input.nextDouble();
                System.out.print ( "Enter c: " );
                double c = input.nextDouble();

                Triangle triangle = new Triangle(a, b, c);

                System.out.println( "Area of the shape: " +String.format("%.2f", triangle.area ( ) ) );
                System.out.println( "Perimeter of the shape: " +String.format("%.2f", triangle.perimeter ( ) ) );
                System.out.print("SUCCESS");
                break;
        
            default:
            System.out.println( "Invalid input!" );
                break;
        }

        input.close();
    }
}
