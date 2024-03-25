import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Задача 1
        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;

        double[] b = {1.57, 7.654, 9.986};

        int[] c = new int[10];
        c[0] = 21;
        c[1] = 345;
        c[2] = 196;

        // Задача 2
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));

        // Задача 3
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = b.length - 1; i >= 0; i--) {
            System.out.print(b[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = c.length - 1; i >= 0; i--) {
            System.out.print(c[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }

        // Задача 4
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                a[i] += 1;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}