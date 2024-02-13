public class Triangular_shape {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("X" + "\t ");
            }//end of inner loop
            System.out.println();
        }//end of outer loop
    }
}//end of class