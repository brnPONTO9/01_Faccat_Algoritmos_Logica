import java.util.Arrays;
import java.util.Scanner;
public class Ex87 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] v = new double[11]; // 10 lidos + 1 vaga para o novo
        for (int i = 0; i < 10; i++) { System.out.print("Número " + (i + 1) + ": "); v[i] = in.nextDouble(); }
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9 - i; j++)
                if (v[j] > v[j + 1]) { double t = v[j]; v[j] = v[j + 1]; v[j + 1] = t; }
        System.out.println("Ordenado: " + Arrays.toString(Arrays.copyOf(v, 10)));
        System.out.print("Novo número: ");
        double novo = in.nextDouble();
        int pos = 10;
        while (pos > 0 && v[pos - 1] > novo) { v[pos] = v[pos - 1]; pos--; }
        v[pos] = novo;
        System.out.println("Com o novo número: " + Arrays.toString(v));
    }
}
