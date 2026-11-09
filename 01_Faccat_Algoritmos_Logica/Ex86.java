import java.util.Arrays;
import java.util.Scanner;
public class Ex86 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] v = new double[10];
        for (int i = 0; i < 10; i++) { System.out.print("Número " + (i + 1) + ": "); v[i] = in.nextDouble(); }
        for (int i = 0; i < v.length - 1; i++) // bubble sort
            for (int j = 0; j < v.length - 1 - i; j++)
                if (v[j] > v[j + 1]) { double t = v[j]; v[j] = v[j + 1]; v[j + 1] = t; }
        System.out.println("Ordenado: " + Arrays.toString(v));
    }
}
