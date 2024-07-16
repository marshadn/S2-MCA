//  Create a Graphics package that has classes and interfaces for figures Rectangle, Triangle, Square and Circle. Test the package by finding the area of these figures.

import Graphics.*;

public class GraphicsPkg {

    public static void main(String[] args) {

        Rectangle r = new Rectangle(3, 4);
        System.out.println("Rectangle area: " + r.area());

        Triangle t = new Triangle(3, 4);
        System.out.println("Triangle area: " + t.area());

        Square s = new Square(3);
        System.out.println("Square area: " + s.area());

        Circle c = new Circle(3);
        System.out.println("Circle area: " + c.area());
    }

}