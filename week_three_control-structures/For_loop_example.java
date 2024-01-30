/*
an example of a for loop which prints numbers 1-10  and the sum
 */
public class For_loop_example {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <=10; i++) {
            System.out.println(i);
            sum += i;
        }
        System.out.println("The sum of the numbers is: " + sum);
    }
}

