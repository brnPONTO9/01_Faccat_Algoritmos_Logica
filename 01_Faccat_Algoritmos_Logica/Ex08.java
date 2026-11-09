import java.util.Scanner;
public class Ex08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Total de eleitores: ");
        double total = in.nextDouble();
        System.out.print("Votos brancos: ");
        double brancos = in.nextDouble();
        System.out.print("Votos nulos: ");
        double nulos = in.nextDouble();
        System.out.print("Votos válidos: ");
        double validos = in.nextDouble();
        System.out.printf("Brancos: %.2f%%%n", brancos * 100 / total);
        System.out.printf("Nulos: %.2f%%%n", nulos * 100 / total);
        System.out.printf("Válidos: %.2f%%%n", validos * 100 / total);
    }
}
