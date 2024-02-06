/*
a java program that will print the following output till 10
    Integer  square  cube
     1        1       1
     2        4       8

sum: 3    9       27

*/
public class Test {
    public static void main(String[] args) {
        System.out.println("Integer\tSquare\tCube");
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            int square = i * i;
            int cube = i * i * i;

            System.out.println(i + "\t\t" + square + "\t\t" + cube);

            sum += i;
        }

        System.out.println("\nSum:\t" + sum + "\t\t" + (sum * sum) + "\t\t" + (sum * sum * sum));
    }
}

