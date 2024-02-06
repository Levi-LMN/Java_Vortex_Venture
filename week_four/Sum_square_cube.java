/*
prints the sum, square, and cube of the first 10 natural numbers
 */
public class Sum_square_cube {
    public static void main(String[] args) {
        for (int num = 1; num <= 10; num++) {
            int sum = 0;
            int square = num * num;
            int cube = num * num * num;

            for (int i = 1; i <= num; i++) {
                sum += i;
            }

            System.out.println("For " + num + ":");
            System.out.println("  The sum is: " + sum);
            System.out.println("  The square is: " + square);
            System.out.println("  The cube is: " + cube);
            System.out.println();
        }
    }
}
