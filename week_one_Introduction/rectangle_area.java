/*
write a program to calculate area of a rectangle
 */

public class rectangle_area {
    public static void main(String[] args) {
        Scanner myinput = new Scanner(System.in);
        double length = 0;
        double breadth = 0;
        double area = 0;
        double perimeter = 0;
        System.out.println("Enter the value of the length of the rectangle");
        length = myinput.nextDouble();
        System.out.println("Enter the value of the breadth of the rectangle");
        breadth = myinput.nextDouble();
        area = length * breadth;
        perimeter = 2 * (length + breadth);
        System.out.println("The area of the rectangle is :\t" + area);
        System.out.println("The perimeter of the rectangle is :\t" + perimeter);
    }
}