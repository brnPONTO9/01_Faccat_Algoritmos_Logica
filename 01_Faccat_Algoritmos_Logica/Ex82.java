import java.util.Arrays;
import java.util.Scanner;
public class Ex82 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] a = new double[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("A[" + (i + 1) + "]: ");
            a[i] = in.nextDouble();
        }
        System.out.print("X: ");
        double x = in.nextDouble();
        double[] m = new double[10];
        for (int i = 0; i < 10; i++) m[i] = a[i] * x;
        System.out.println("M = " + Arrays.toString(m));
    }
}
