/*
the continue statement is used to skip the current iteration of the loop and continue with the next iteration.
 */
public class Continue {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;// it will continue the loop when i=5
            }
            System.out.println(i);
        }
    }
}