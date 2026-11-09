import java.util.Arrays;
import java.util.Scanner;
public class Ex88 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] v = new double[20];
        for (int i = 0; i < 20; i++) { System.out.print("Número " + (i + 1) + ": "); v[i] = in.nextDouble(); }
        System.out.print("Número a verificar: ");
        double x = in.nextDouble();
        int pos = -1;
        for (int i = 0; i < 20; i++) if (v[i] == x) { pos = i; break; }
        if (pos < 0) { System.out.println("Não existe no vetor."); return; }
        double[] novo = new double[19];
        for (int i = 0, k = 0; i < 20; i++) if (i != pos) novo[k++] = v[i];
        System.out.println("Existe. Novo vetor: " + Arrays.toString(novo));
    }
}
