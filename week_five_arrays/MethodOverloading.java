/*
Method overload class with the following methods:
1.a method that returns the sum of 4 integer values
2.a method that returns the sum of 2 integer values
3.a method that returns the sum of 3 integer values
4. a method that returns the sum of 2 double values
5. a method that returns the sum of 3 double values

they are all before the main method
 */
public class MethodOverloading {

    public static int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }//end of method for sum of 4 integers

    public static int sum(int a, int b) {
        return a + b;
    }//end of method for sum of 2 integers

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }//end of method for sum of 3 integers

    public static double sum(double a, double b) {
        return a + b;
    }//end of method for sum of 2 doubles

    public static double sum(double a, double b, double c) {
        return a + b + c;
    }//end of method for sum of 3 doubles

    public static void main(String[] args) {

        int a = 10, b = 20, c = 30, d = 40;
        double a1 = 10.5, b1 = 20.5, c1 = 30.5;
        int s1 = sum(a, b, c, d);
        int s2 = sum(a, b);
        int s3 = sum(a, b, c);
        double s4 = sum(a1, b1);
        double s5 = sum(a1, b1, c1);
        // method 1
        System.out.println("Sum of 4 integers: " + s1);
        //for method 2
        System.out.println("Sum of 2 integers: " + s2);
        //for method 3
        System.out.println("Sum of 3 integers: " + s3);
        //for method 4
        System.out.println("Sum of 2 doubles: " + s4);
        //for method 5
        System.out.println("Sum of 3 doubles: " + s5);



        
    }//end of main method

}//end of class
