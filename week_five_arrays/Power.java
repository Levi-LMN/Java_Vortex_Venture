/*
a java method that receives two integers from keyboard values x and y and return the power of the two values
 */
package week_five_arrays;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        int x = input.nextInt();
        System.out.println("Enter the value of y: ");
        int y = input.nextInt();
        System.out.println("The power of the two values is: " + power(x, y));
    }

    public static int power(int x, int y) {
        return (int) Math.pow(x, y);
    }
}
