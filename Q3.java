/*Swap two numbers without using a third variable. */

public class Q3 {

    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        System.out.println("Before Swapping: a = " + a + ", b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swapping: a = " + a + ", b = " + b);

    }
}
