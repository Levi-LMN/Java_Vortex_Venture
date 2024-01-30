/*
accept an integer from the keyboard and print only if it is odd and between 1 and 67
 */
import java.util.Scanner;
public class Odd_between1_and_67 {
    public static void main(String[] args) {
        Scanner myinput = new Scanner(System.in);
        int number = 0;
        System.out.println("Enter a number");
        number = myinput.nextInt();
        if (number >= 1 && number <= 67) {
            if (number % 2 == 0) {
                System.out.println("The number is even");
            } else {
                System.out.println("The number is odd");
            }
        } else {
            System.out.println("The number is not between 1 and 67");
        }
    }
}