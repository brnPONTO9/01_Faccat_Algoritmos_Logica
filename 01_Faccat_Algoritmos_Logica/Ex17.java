import java.util.Scanner;
public class Ex17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nota da 1ª avaliação: ");
        double n1 = in.nextDouble();
        System.out.print("Nota da 2ª avaliação: ");
        double n2 = in.nextDouble();
        double media = (n1 + n2) / 2;
        System.out.println(media >= 6 ? "Aprovado" : "Reprovado");
        System.out.printf("Média: %.2f%n", media);
    }
}
