public class PassingArrayToMethods {

    public static void main(String[] args) {

        int[] x = {10,3,4,5,6,7};

        System.out.println("Before change: " + x[2]);

        change(x);

        System.out.println("After change: " + x[2]);
    }

    public static void change(int[] x) {

        x[2] = 5;
    }
}