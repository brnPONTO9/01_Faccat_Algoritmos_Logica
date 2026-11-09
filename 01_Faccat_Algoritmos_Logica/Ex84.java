import java.util.Arrays;
import java.util.Scanner;
public class Ex84 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Tamanho N: ");
        int n = in.nextInt();
        double[] a = new double[n], b = new double[n], soma = new double[n];
        for (int i = 0; i < n; i++) { System.out.print("A[" + (i + 1) + "]: "); a[i] = in.nextDouble(); }
        for (int i = 0; i < n; i++) { System.out.print("B[" + (i + 1) + "]: "); b[i] = in.nextDouble(); }
        for (int i = 0; i < n; i++) soma[i] = a[i] + b[i];
        System.out.println("Soma = " + Arrays.toString(soma));
    }
}
