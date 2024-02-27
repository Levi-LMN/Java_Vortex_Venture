/*
This program prints odd numbers between 1 and 100 and then prints the sum of all the odd numbers.
 */

public class PrintOdd {
    public static void main(String[] args) {
        int sum = 0;

        for(int i =1; i<=100; i++){
            if(i % 2 == 0){
                //the number is even so do nothing
            }
            else{
                System.out.println(i);
                sum +=i;
            }//end of else
        }//end of for loop
        System.out.println("The sum of odd numbers is : " + sum);
    }//end of main
}//end of class