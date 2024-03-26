// Abstract class for 2D shapes
abstract class TwoDShape {
    // Common data members for all 2D shapes
    abstract double area();
    abstract double perimeter();
}

// Concrete class for Square
class Square extends TwoDShape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    double area() {
        return side * side;
    }

    @Override
    double perimeter() {
        return 4 * side;
    }
}

// Concrete class for Rectangle
class Rectangle extends TwoDShape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }

    @Override
    double perimeter() {
        return 2 * (length + width);
    }
}

// Concrete class for Triangle
class Triangle extends TwoDShape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    double area() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    double perimeter() {
        return side1 + side2 + side3;
    }
}

// Concrete class for Circle
class Circle extends TwoDShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * radius;
    }
}

// Example class to demonstrate the usage of 2D shapes
public class TwoDExample {
    public static void main(String[] args) {
        TwoDShape[] shapes = {
                new Square(5),
                new Rectangle(4, 6),
                new Triangle(3, 4, 5),
                new Circle(3)
        };

        for (TwoDShape shape : shapes) {
            if (shape instanceof Square) {
                System.out.println("Square:");
            } else if (shape instanceof Rectangle) {
                System.out.println("Rectangle:");
            } else if (shape instanceof Triangle) {
                System.out.println("Triangle:");
            } else if (shape instanceof Circle) {
                System.out.println("Circle:");
            }
            System.out.println("Area: " + shape.area());
            System.out.println("Perimeter: " + shape.perimeter());
            System.out.println();
        }
    }
}
