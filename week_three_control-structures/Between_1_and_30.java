/*
a program that will accept an integer from the keyboard and print it out if it is between 1 and 30
 */
import java.util.Scanner;
public class Between_1_and_30 {
    public static void main(String[] args) {
        Scanner myinput = new Scanner(System.in);
        int number = 0;
        System.out.println("Enter a number");
        number = myinput.nextInt();
        if (number >= 1 && number <= 30) {
            System.out.println("The number is between 1 and 30");
        } else {
            System.out.println("The number is not between 1 and 30");
        }
    }
}