import java.util.Scanner;
public class Ex72 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double maior = 0, soma = 0;
        for (int i = 1; i <= 15; i++) {
            System.out.print("Código do produto " + i + ": ");
            in.nextInt();
            System.out.print("Preço do produto " + i + ": ");
            double p = in.nextDouble();
            if (i == 1 || p > maior) maior = p;
            soma += p;
        }
        System.out.printf("Maior preço: %.2f | Média dos preços: %.2f%n", maior, soma / 15);
    }
}
