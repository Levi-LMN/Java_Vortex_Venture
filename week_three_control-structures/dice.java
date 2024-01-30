/*
a program that will accept an integer from the keyboard and check if it is one of the six faces of a dice.
 */
import java.util.Scanner;
public class dice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 6: ");
        int number = input.nextInt();
        if (number == 1) {
            System.out.println("You entered 1, which is one of the six faces of a dice.");
        } else if (number == 2) {
            System.out.println("You entered 2, which is one of the six faces of a dice.");
        } else if (number == 3) {
            System.out.println("You entered 3, which is one of the six faces of a dice.");
        } else if (number == 4) {
            System.out.println("You entered 4, which is one of the six faces of a dice.");
        } else if (number == 5) {
            System.out.println("You entered 5, which is one of the six faces of a dice.");
        } else if (number == 6) {
            System.out.println("You entered 6, which is one of the six faces of a dice.");
        } else {
            System.out.println("You entered a number that is not one of the six faces of a dice.");
        }
    }
}