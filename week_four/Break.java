/*
the java break is used to break the current flow of the program
 */
public class Break {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;// it will break the loop when i=5
            }
            System.out.println(i);
        }
    }
}