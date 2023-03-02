package HWclass26;


public class ShapeTest {
    // Test.java
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Circle perimeter: " + circle.calculatePerimeter());

        Shape square = new Square(4);
        System.out.println("Square area: " + square.calculateArea());
        System.out.println("Square perimeter: " + square.calculatePerimeter());
    }
}


