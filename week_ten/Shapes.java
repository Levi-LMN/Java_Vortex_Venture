import java.util.Scanner;//importing the scanner class

// Abstract class representing 2D shapes
abstract class Shape2D {
    // Abstract methods to calculate area and perimeter
    abstract double calculateArea(); // Method signature for calculating the area of the shape
    abstract double calculatePerimeter(); // Method signature for calculating the perimeter of the shape
}//end of Shape2D

// Square class
class Square extends Shape2D {
    private final double length; // Length of the square

    // Constructor to initialize the length of the square
    public Square(double length) {
        this.length = length;
    }//end of Square

    // Override method to calculate the area of the square
    @Override
    public double calculateArea() {
        return length * length; // Area of the square formula: side * side
    }//end of calculateArea

    // Override method to calculate the perimeter of the square
    @Override
    public double calculatePerimeter() {
        return 4 * length; // Perimeter of the square formula: 4 * side
    }//end of calculatePerimeter
}//end of Square

// Rectangle class
class Rectangle extends Shape2D {
    private final double length; // Length of the rectangle
    private final double width; // Width of the rectangle

    // Constructor to initialize the length and width of the rectangle
    public Rectangle(double length, double width) {
        this.length = length;//assigning the length to the length variable
        this.width = width;//
    }//end of Rectangle

    // Override method to calculate the area of the rectangle
    @Override
    public double calculateArea() {
        return length * width; // Area of the rectangle formula: length * width
    }//end of calculateArea

    // Override method to calculate the perimeter of the rectangle
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width); // Perimeter of the rectangle formula: 2 * (length + width)
    }//end of calculatePerimeter
}//end of Rectangle

// Triangle class
class Triangle extends Shape2D {
    private final double base; // Length of the base of the triangle
    private final double height; // Height of the triangle
    private final double hypotenuse; // Length of the hypotenuse of the triangle

    // Constructor to initialize the base, height, and hypotenuse of the triangle
    public Triangle(double base, double height, double hypotenuse) {
        this.base = base;//assigning the base to the base variable
        this.height = height;//assigning the height to the height variable
        this.hypotenuse = hypotenuse;
    }//end of Triangle

    // Override method to calculate the area of the triangle
    @Override
    public double calculateArea() {
        return (base * height) / 2; // Area of the triangle formula: (base * height) / 2
    }//end of calculateArea

    // Override method to calculate the perimeter of the triangle
    @Override
    public double calculatePerimeter() {
        return base + height + hypotenuse; // Perimeter of the triangle formula: base + height + hypotenuse
    }//end of calculatePerimeter
}//end of Triangle

// Circle class
class Circle extends Shape2D {
    private final double radius; // Radius of the circle

    // Constructor to initialize the radius of the circle
    public Circle(double radius) {
        this.radius = radius;
    }//end of Circle

    // Override method to calculate the area of the circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius; // Area of the circle formula: π * radius * radius
    }//end of calculateArea

    // Override method to calculate the circumference of the circle (perimeter)
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius; // Circumference of the circle formula: 2 * π * radius
    }//end of calculatePerimeter
}//end of Circle

// Main class
public class Shapes {
    public static void main(String[] args) {
        // Using try-with-resources to automatically close the scanner
        try (Scanner scanner = new Scanner(System.in)) {
            // Array to store different shapes
            Shape2D[] shapes = {
                    // Creating a square with user input length
                    new Square(getDimension(scanner, "Enter the length of the square:")),
                    // Creating a rectangle with user input length and width
                    new Rectangle(getDimension(scanner, "Enter the length of the rectangle:"),
                            getDimension(scanner, "Enter the width of the rectangle:")),
                    // Creating a triangle with user input base, height, and hypotenuse
                    new Triangle(getDimension(scanner, "Enter the base of the triangle:"),
                            getDimension(scanner, "Enter the height of the triangle:"),
                            getDimension(scanner, "Enter the hypotenuse of the triangle:")),
                    // Creating a circle with user input radius
                    new Circle(getDimension(scanner, "Enter the radius of the circle:"))
            };//end of shapes

            // Iterating through each shape
            for (Shape2D shape : shapes) {
                // Printing area and perimeter of each shape
                System.out.println("Area: " + shape.calculateArea());
                System.out.println("Perimeter: " + shape.calculatePerimeter());
                System.out.println();
            }//end of for loop
        }//end of try block
    }//end of main

    // Helper method to get a dimension from the user
    private static double getDimension(Scanner scanner, String prompt) {
        // Displaying prompt to the user
        System.out.println(prompt);
        // Reading and returning the dimension inputted by the user
        return scanner.nextDouble();
    }//end of getDimension
}//end of Shapes
