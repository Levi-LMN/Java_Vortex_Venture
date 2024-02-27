/*
This program prints the integers from 1 to 100 and then prints the sum of all the integers.
 */

public class PrintInteger {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1;i <= 100; i++){
            System.out.println(i);
            sum += i;
        }

        System.out.println("The sum is : " + sum);
    }
}