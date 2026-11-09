import java.util.Scanner;
public class Ex73 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double somaSal = 0, maior = 0;
        int somaFilhos = 0, n = 0, baixos = 0;
        while (true) {
            System.out.print("Salário (negativo encerra): ");
            double sal = in.nextDouble();
            if (sal < 0) break;
            System.out.print("Número de filhos: ");
            int filhos = in.nextInt();
            somaSal += sal;
            somaFilhos += filhos;
            if (n == 0 || sal > maior) maior = sal;
            if (sal < 150) baixos++;
            n++;
        }
        if (n == 0) { System.out.println("Nenhum habitante informado."); return; }
        System.out.printf("a) Média de salário: %.2f%n", somaSal / n);
        System.out.printf("b) Média de filhos: %.2f%n", (double) somaFilhos / n);
        System.out.printf("c) Maior salário: %.2f%n", maior);
        System.out.printf("d) Salário < R$ 150,00: %.2f%%%n", baixos * 100.0 / n);
    }
}
