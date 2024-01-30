/*
a program that will accept an integer from the keyboard and check if it is the appropriate legth of a triangle whose base lentgh and hypotenuse length is given(Hint: use pythogran theorem)
 */
import java.util.Scanner;
public class check_length {
    public static void main(String[] args) {
        Scanner myinput = new Scanner(System.in);
        int number = 0;
        int base = 0;
        int hypotenuse = 0;
        System.out.println("Enter a number");
        number = myinput.nextInt();
        System.out.println("Enter the base");
        base = myinput.nextInt();
        System.out.println("Enter the hypotenuse");
        hypotenuse = myinput.nextInt();
        if (number == Math.sqrt((base * base) + (hypotenuse * hypotenuse))) {
            System.out.println("The number is the length of the triangle");
        } else {
            System.out.println("The number is not the length of the triangle");
        }
    }
}