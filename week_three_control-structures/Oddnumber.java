/*
 a program that reads a number and prints only if the number is odd
 */
import java.util.Scanner;
public class Oddnumber {
    public static void main(String[] args) {
        Scanner myinput = new Scanner(System.in);
        int number = 0;
        System.out.println("Enter a number");
        number = myinput.nextInt();
        if (number % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }
}