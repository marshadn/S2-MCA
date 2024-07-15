/*Create an interface having prototypes of functions area() and perimeter(). Create 
two classes Circle and Rectangle which implements the above interface. Create a menu 
driven program to find area and perimeter of objects. */

import java.util.Scanner;

// Interface with prototypes of functions area() and perimeter()
interface Shape {
    double area();
    double perimeter();
}

// Circle class implementing Shape interface
class Circle implements Shape {
    double radius;

    // Constructor to initialize Circle
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementation of area() method
    public double area() {
        return Math.PI * radius * radius;
    }

    // Implementation of perimeter() method
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

// Rectangle class implementing Shape interface
class Rectangle implements Shape {
    double length;
    double width;

    // Constructor to initialize Rectangle
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementation of area() method
    public double area() {
        return length * width;
    }

    // Implementation of perimeter() method
    public double perimeter() {
        return 2 * (length + width);
    }
}

public class ShapeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the radius of the circle: ");
                    double radius = scanner.nextDouble();
                    Circle circle = new Circle(radius);
                    System.out.println("Area of the circle: " + circle.area());
                    System.out.println("Perimeter of the circle: " + circle.perimeter());
                    break;
                case 2:
                    System.out.print("Enter the length of the rectangle: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter the width of the rectangle: ");
                    double width = scanner.nextDouble();
                    Rectangle rectangle = new Rectangle(length, width);
                    System.out.println("Area of the rectangle: " + rectangle.area());
                    System.out.println("Perimeter of the rectangle: " + rectangle.perimeter());
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 3);

        scanner.close();
    }
}
