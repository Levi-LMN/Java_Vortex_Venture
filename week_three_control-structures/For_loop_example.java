/*
An example of a for loop which prints numbers 1-10  and the sum of the numbers,the cube and the square of the numbers.
 */
public class For_loop_example {
    public static void main(String[] args) {
        int sum = 0;
        int cube = 0;
        int square = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
            cube = i * i * i;
            square = i * i;
            System.out.println("The number is " + i + " and the sum is " + sum + " and the cube is " + cube + " and the square is " + square);
        }
    }
}
