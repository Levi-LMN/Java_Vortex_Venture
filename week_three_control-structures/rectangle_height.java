public class rectangle_height {
    public static void main(String[] args) {
        int l = 50;
        int w = 320;
        long vol = 200000;
        float h = (float) vol / (l * w);
        System.out.println("The height of the tank is: " + h);
    }
}
