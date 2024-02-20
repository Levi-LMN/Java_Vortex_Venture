import java.util.Scanner;

class Rectangle {
    private int width;
    private int length;

    // Default constructor to initialize the class data members
    Rectangle() {
        width = 10;
        length = 15;
    }

    // Parameterized constructor
    Rectangle(int w, int l) {
        width = w;
        length = l;
    }

    // Method to calculate and return the area of the rectangle
    public int area() {
        return width * length;
    }

    // Method to calculate and return the perimeter of the rectangle
    public int perimeter() {
        return 2 * (width + length);
    }

    // Getter method for width
    public int getWidth() {
        return width;
    }

    // Getter method for length
    public int getLength() {
        return length;
    }

    // Setter method for width
    public void setWidth(int w) {
        width = w;
    }

    // Setter method for length
    public void setLength(int l) {
        length = l;
    }
}

// Class RectMain to implement the Rectangle class
public class RectMainTwo {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        Rectangle r1 = new Rectangle(); // Creating an object r1 using constructor without parameters
        System.out.println("The area of the rectangle is " + r1.area());
        System.out.println("The perimeter of the rectangle is " + r1.perimeter());

        // Using getter and setter methods for r1
        System.out.println("Width of r1: " + r1.getWidth());
        System.out.println("Length of r1: " + r1.getLength());

        // Input for the second rectangle
        System.out.println("Enter the width");
        int wid = scan.nextInt();
        System.out.println("Enter the length");
        int len = scan.nextInt();

        Rectangle r2 = new Rectangle(wid, len); // Creating an object r2 using constructor with parameters
        System.out.println("The area of the new rectangle is " + r2.area());
        System.out.println("The perimeter of the new rectangle is " + r2.perimeter());

        // Using setter methods for r2
        r2.setWidth(20);
        r2.setLength(30);

        System.out.println("Updated width of r2: " + r2.getWidth());
        System.out.println("Updated length of r2: " + r2.getLength());
    }//end of main method
}//end of class
