/*
a java program to print the numbers from 1 to 120 in columns of 10
 */
public class Columns_of_ten {
    public static void main(String[] args) {
        for (int i = 1; i <= 120; i++) {
            System.out.print(i + "\t");
            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }
}
