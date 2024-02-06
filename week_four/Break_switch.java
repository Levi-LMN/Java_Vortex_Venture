/*
uses switch to break out of a loop
 */
public class Break_switch {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            switch (i) {
                case 5:
                    break;
            }
            System.out.println(i);
            i++;
        }
    }
}