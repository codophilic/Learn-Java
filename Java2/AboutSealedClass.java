sealed class Shape permits Circle, Rectangle, Triangle {
    public double getArea() {
        return 0; // Default implementation
    }
}

// `final` subclass: No further subclasses allowed
final class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }
}

// `sealed` subclass: Restricts further subclassing
sealed class Rectangle extends Shape permits Square {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }
}

// Subclass of `Rectangle`: Allowed because Rectangle is sealed
final class Square extends Rectangle {
    
    public Square(double side) {
        super(side, side); // A square is a rectangle with equal sides
    }
}

// `non-sealed` subclass: Allows unrestricted inheritance
non-sealed class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
}

// Subclass of `non-sealed` Triangle: Allowed because Triangle is non-sealed
class RightAngledTriangle extends Triangle {
    public RightAngledTriangle(double base, double height) {
        super(base, height);
    }
}


public class AboutSealedClass {
    public static void main(String[] args) {
        Shape circle = new Circle(10);
        System.out.println("Area of Circle: " + circle.getArea());

        Shape rectangle = new Rectangle(5, 7);
        System.out.println("Area of Rectangle: " + rectangle.getArea());

        Shape square = new Square(4);
        System.out.println("Area of Square: " + square.getArea());

        Shape triangle = new Triangle(6, 8);
        System.out.println("Area of Triangle: " + triangle.getArea());

        Shape rightTriangle = new RightAngledTriangle(6, 8);
        System.out.println("Area of Right-Angled Triangle: " + rightTriangle.getArea());
    }
}
