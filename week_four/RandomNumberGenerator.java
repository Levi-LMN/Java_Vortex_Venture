public class RandomNumberGenerator {
    public static void main(String[] args) {
        // Initialize variables
        int sumOfNumbers = 0;
        int counter = 0;

        // Generate and sum 20 random integers between 1 and 30
        while (counter < 20) {
            int randomNumber = (int) (Math.random() * 30) + 1;
            sumOfNumbers += randomNumber;
            counter++;
        }

        // Print the sum
        System.out.println("Sum of the generated numbers: " + sumOfNumbers);
    }
}
