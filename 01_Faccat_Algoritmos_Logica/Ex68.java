import java.util.Scanner;
public class Ex68 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Número total de mercadorias: ");
        int n = in.nextInt();
        double total = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Valor da mercadoria " + i + ": ");
            total += in.nextDouble();
        }
        System.out.printf("Valor total em estoque: %.2f%n", total);
        if (n > 0) System.out.printf("Média de valor: %.2f%n", total / n);
    }
}
