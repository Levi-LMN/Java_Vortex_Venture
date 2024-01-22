
/*
write a program to calculate the area of a circle
 */
public class circle_area {
    public static void main(String[] args) {
        Scanner myinput = new Scanner(System.in);
        double radius = 0;
        double area = 0;
        double perimeter = 0;
        System.out.println("Enter the value of the radius of the circle");
        radius = myinput.nextDouble();
        area = Math.PI * Math.pow(radius, 2);
        perimeter = 2 * Math.PI * radius;
        System.out.println("The area of the circle is :\t" + area);
        System.out.println("The perimeter of the circle is :\t" + perimeter);
    }
}