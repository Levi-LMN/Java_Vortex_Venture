/*
asks the user his marks the prints a grade and a remart based on the marks
 */
import java.util.Scanner;
public class Marks {
    public static void main(String[] args) {
        Scanner myinput = new Scanner(System.in);
        int marks = 0;
        System.out.println("Enter your marks");
        marks = myinput.nextInt();
        if (marks >= 70 && marks <= 100) {
            System.out.println("Your grade is A");
            System.out.println("Excellent");
        } else if (marks >= 60 && marks <= 69) {
            System.out.println("Your grade is B");
            System.out.println("Very Good");
        } else if (marks >= 50 && marks <= 59) {
            System.out.println("Your grade is C");
            System.out.println("Good");
        } else if (marks >= 40 && marks <= 49) {
            System.out.println("Your grade is D");
            System.out.println("Fair");
        } else if (marks >= 0 && marks <= 39) {
            System.out.println("Your grade is F");
            System.out.println("Fail");
        } else {
            System.out.println("Invalid marks");
        }
    }
}