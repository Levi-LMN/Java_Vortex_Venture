// Importing the Scanner class for user input
import java.util.Scanner;

// Abstract class for 3D shapes
abstract class Shape3D {
    // Abstract method to calculate volume
    abstract double calculateVolume();
    // Abstract method to calculate surface area
    abstract double calculateSurfaceArea();
}// end of Shape3D class

// Cube class extending the abstract Shape3D class
class Cube extends Shape3D {
    // Side length of the cube
    private final double side;

    // Cube constructor
    public Cube(double side) {
        this.side = side;
    }// end of Cube constructor

    // Overridden method to calculate volume of the cube
    @Override
    public double calculateVolume() {
        return side * side * side;
    }// end of calculateVolume method

    // Overridden method to calculate surface area of the cube
    @Override
    public double calculateSurfaceArea() {
        return 6 * side * side;
    }// end of calculateSurfaceArea method
}// end of Cube class

// Sphere class extending the abstract Shape3D class
class Sphere extends Shape3D {
    // Radius of the sphere
    private final double radius;

    // Sphere constructor
    public Sphere(double radius) {
        this.radius = radius;
    }// end of Sphere constructor

    // Overridden method to calculate volume of the sphere
    @Override
    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }// end of calculateVolume method

    // Overridden method to calculate surface area of the sphere
    @Override
    public double calculateSurfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }// end of calculateSurfaceArea method
}// end of Sphere class

// Cylinder class extending the abstract Shape3D class
class Cylinder extends Shape3D {
    // Radius and height of the cylinder
    private final double radius;
    private final double height;

    // Cylinder constructor
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }// end of Cylinder constructor

    // Overridden method to calculate volume of the cylinder
    @Override
    public double calculateVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }// end of calculateVolume method

    // Overridden method to calculate surface area of the cylinder
    @Override
    public double calculateSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }// end of calculateSurfaceArea method
}// end of Cylinder class

// Cone class extending the abstract Shape3D class
class Cone extends Shape3D {
    // Radius and height of the cone
    private final double radius;
    private final double height;

    // Cone constructor
    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }// end of Cone constructor

    // Overridden method to calculate volume of the cone
    @Override
    public double calculateVolume() {
        return (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
    }// end of calculateVolume method

    // Overridden method to calculate surface area of the cone
    @Override
    public double calculateSurfaceArea() {
        double slantHeight = Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
        return Math.PI * radius * (radius + slantHeight);
    }// end of calculateSurfaceArea method
}// end of Cone class

// Main class
public class ThreeDimensionalShapes {
    // Main method
    public static void main(String[] args) {
        // Try-with-resources block to handle the Scanner
        try (Scanner scanner = new Scanner(System.in)) {
            // Array of Shape3D objects
            Shape3D[] shapes = {
                    new Cube(getDimension(scanner, "Enter the side length of the cube:")),
                    new Sphere(getDimension(scanner, "Enter the radius of the sphere:")),
                    new Cylinder(getDimension(scanner, "Enter the radius of the cylinder:"),
                            getDimension(scanner, "Enter the height of the cylinder:")),
                    new Cone(getDimension(scanner, "Enter the radius of the cone:"),
                            getDimension(scanner, "Enter the height of the cone:"))
            };// end of shapes array

            // Loop through each shape in the array
            for (Shape3D shape : shapes) {
                // Print the volume of the shape
                System.out.println("Volume: " + shape.calculateVolume());
                // Print the surface area of the shape
                System.out.println("Surface Area: " + shape.calculateSurfaceArea());
                // Print a blank line for readability
                System.out.println();
            }// end of for loop
        }// end of try block
    }// end of main method

    // Method to get a dimension value from the user
    private static double getDimension(Scanner scanner, String prompt) {
        // Print the prompt
        System.out.println(prompt);
        // Return the user's input
        return scanner.nextDouble();
    }// end of getDimension method
}// end of ThreeDimensionalShapes class