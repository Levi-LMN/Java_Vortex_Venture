import java.util.Scanner;

public class GreetingProgram {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Prompt the user to enter their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Display a personalized greeting on separate lines using the newline character
        System.out.println("Hello, " + name + "!\nYou are " + age + " years old.");

        // Close the Scanner to avoid resource leaks
        scanner.close();
    }
}
