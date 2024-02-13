/*
Write a program that creates an array CATS that stores cats of 50 students
that are randomly generated,
 ranging from 5 to 30.
The program should print the vertically and
their total sum and average at the bottom
 */
public class Cats_array {
    public static void main(String[] args) {
        int[] CATS = new int[50];
        int sum = 0;
        for (int i = 0; i < CATS.length; i++) {
            CATS[i] = (int) (Math.random() * 26) + 5;
            sum += CATS[i];
        }
        for (int i = 0; i < CATS.length; i++) {
            System.out.println("CATS[" + i + "] = " + CATS[i]);
        }
        System.out.println("The sum of the CATS is " + sum);
        System.out.println("The average of the CATS is " + (sum / CATS.length));
    }
}