/*
Write Java program using the += operator and the while loop to generate the sum of 1 to 100

 */
public class loop_operator {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println("The sum of 1 to 100 is :\t" + sum);
    }
}