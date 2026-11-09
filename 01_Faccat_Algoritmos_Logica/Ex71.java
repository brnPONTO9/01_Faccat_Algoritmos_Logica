import java.util.Scanner;
public class Ex71 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Quantidade de números: ");
        int n = in.nextInt();
        double maior = 0, soma = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Número " + i + ": ");
            double v = in.nextDouble();
            if (i == 1 || v > maior) maior = v;
            soma += v;
        }
        if (n > 0) System.out.printf("Maior: %.2f | Média: %.2f%n", maior, soma / n);
    }
}
