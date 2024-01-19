/*An interactive program is one that accepts input from the user and displays output to the user.
* The Scanner class is used to accept input from the user.
* The Scanner class is located in the java.util package.
* To use the Scanner class, you must import it into your program.
* The Scanner class is used to accept input from the user.
* The Scanner class is located in the java.util package.

 */
import java.util.Scanner;
public class Interactiveexample {//class name interactiveexample.java should be the name of the file
    public static void main(String[] args) {//ensure you master this method
        Scanner myinput = new Scanner(System.in);
        short l = 20;
        short w = 9;
        int area = l * w;
        int perimeter = 2 * (l + w);
        System.out.println("The area of the rectangle is :\t" + area);
        System.out.println("The perimeter of the rectangle is :\t" + perimeter);

        //prompt the user to enter the length and width of the rectangle
        System.out.println("Enter the value of the length of the rectangle");
        l = myinput.nextShort();
        System.out.println("Enter the value of the width of the rectangle");
        w = myinput.nextShort();

        System.out.println("The area of the rectangle is :\t" + area);
        System.out.println("The perimeter of the rectangle is :\t" + perimeter);
    }//end of main method

}//end of class