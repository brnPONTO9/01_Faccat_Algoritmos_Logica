import java.util.Scanner;
public class Ex91 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] vet = new double[50];
        for (int i = 0; i < 50; i++) { System.out.print("Número " + (i + 1) + ": "); vet[i] = in.nextDouble(); }
        boolean repetido = false;
        boolean[] jaMostrado = new boolean[50];
        for (int i = 0; i < 50; i++) {
            if (jaMostrado[i]) continue;
            StringBuilder pos = new StringBuilder("" + (i + 1));
            int cont = 1;
            for (int j = i + 1; j < 50; j++)
                if (vet[j] == vet[i]) { cont++; jaMostrado[j] = true; pos.append(", ").append(j + 1); }
            if (cont > 1) { repetido = true; System.out.println(vet[i] + " repetido nas posições: " + pos); }
        }
        if (!repetido) System.out.println("Não existem números repetidos.");
    }
}
