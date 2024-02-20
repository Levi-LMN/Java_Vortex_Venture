import java.util.Scanner;

public class Rect {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Rectangle rect = getRectangle();
        printRectangle(rect);// calling the method to print the rectangle
    }

    public static Rectangle getRectangle() {
        Rectangle R = new Rectangle();
        R.width = (int) Math.ceil(Math.random() * 20);
        R.length = (int) Math.ceil(Math.random() * 10);
        return R;
    }

    public static void printRectangle(Rectangle R) {
        System.out.println("The area of the rectangle is " + R.area());
        System.out.println("The perimeter of the rectangle is " + R.perimeter());
        System.out.println("Width of r1: " + R.getWidth());
        System.out.println("Length of r1: " + R.getLength());
    }

    static class Rectangle {
        int width;
        int length;

        public Rectangle() {
            // Default constructor
        }

        public Rectangle(int width, int length) {
            this.width = width;
            this.length = length;
        }

        public int area() {
            return width * length;
        }

        public int perimeter() {
            return 2 * (width + length);
        }

        public int getWidth() {
            return width;
        }

        public int getLength() {
            return length;
        }
    }
}
