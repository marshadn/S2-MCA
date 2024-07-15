import java.util.Scanner;

public class Area {

    // Method to calculate the area of a circle
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to calculate the area of a square
    public double calculateArea(int side) {
        return side * side;
    }

    // Method to calculate the area of a rectangle
    public double calculateArea(int length, int width) {
        return length * width;
    }

    // Method to calculate the area of a triangle
    public double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Area calculator = new Area();

        // Read input for the circle
        System.out.print("Enter radius of the circle: ");
        double radius = scanner.nextDouble();
        double circleArea = calculator.calculateArea(radius);
        System.out.println("Area of the circle: " + circleArea);

        // Read input for the square
        System.out.print("Enter side length of the square: ");
        int side = scanner.nextInt();
        double squareArea = calculator.calculateArea(side);
        System.out.println("Area of the square: " + squareArea);

        // Read input for the rectangle
        System.out.print("Enter length of the rectangle: ");
        int length = scanner.nextInt();
        System.out.print("Enter width of the rectangle: ");
        int width = scanner.nextInt();
        double rectangleArea = calculator.calculateArea(length, width);
        System.out.println("Area of the rectangle: " + rectangleArea);

        // Read input for the triangle
        System.out.print("Enter base of the triangle: ");
        double base = scanner.nextDouble();
        System.out.print("Enter height of the triangle: ");
        double height = scanner.nextDouble();
        double triangleArea = calculator.calculateArea(base, height);
        System.out.println("Area of the triangle: " + triangleArea);

        scanner.close();
    }
}
