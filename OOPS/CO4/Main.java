import Circle;
import Rectangle;
import Shape;
package CO4;
import CO4.Graphics.*;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(10, 5);
        Shape triangle = new Triangle(10, 5);
        Shape square = new Square(5);
        Shape circle = new Circle(7);

        System.out.println("Area of Rectangle: " + rectangle.getArea());
        System.out.println("Area of Triangle: " + triangle.getArea());
        System.out.println("Area of Square: " + square.getArea());
        System.out.println("Area of Circle: " + circle.getArea());
    }
}
