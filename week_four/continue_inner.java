/*
it continues inner loop when i=2 and j=2
 */
public class Continue_inner {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + "\t " );
            }//end of inner loop
            System.out.println();
        }//end of outer loop
    }//end of main
}//end of class