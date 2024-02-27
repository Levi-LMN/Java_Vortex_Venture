import java.util.Scanner;

public class Rect {
    public static class Rectangle {
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
        }//end of method
    }//end of class
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Rectangle rect = getRectangle();
        printRectangle(rect);// calling the method to print the rectangle
    }

    public static Rectangle getRectangle() {// method to get the rectangle
        Rectangle R = new Rectangle();
        R.width = (int) Math.ceil(Math.random() * 20);
        R.length = (int) Math.ceil(Math.random() * 10);
        return R;
    }

    public static void printRectangle(Rectangle R) {// method to print the rectangle
        System.out.println("The area of the rectangle is " + R.area());
        System.out.println("The perimeter of the rectangle is " + R.perimeter());
        System.out.println("Width of r1: " + R.getWidth());
        System.out.println("Length of r1: " + R.getLength());
    }


    }//end of class
}//end of class
