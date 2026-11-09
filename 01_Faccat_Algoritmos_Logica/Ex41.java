import java.util.Scanner;
public class Ex41 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Notas N1 N2 N3: ");
        double n1 = in.nextDouble(), n2 = in.nextDouble(), n3 = in.nextDouble();
        System.out.print("Média dos exercícios: ");
        double me = in.nextDouble();
        double media = (n1 + n2 * 2 + n3 * 3 + me) / 7;
        char conceito;
        if (media >= 9.0) conceito = 'A';
        else if (media >= 7.5) conceito = 'B';
        else if (media >= 6.0) conceito = 'C';
        else conceito = 'D';
        System.out.printf("Média de aproveitamento: %.2f - Conceito %c%n", media, conceito);
    }
}
