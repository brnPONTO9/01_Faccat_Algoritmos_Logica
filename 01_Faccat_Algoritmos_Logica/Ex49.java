import java.util.Scanner;
public class Ex49 {
    static double lerNota(Scanner in, String rotulo) {
        double n;
        do {
            System.out.print(rotulo + " (0 a 10): ");
            n = in.nextDouble();
        } while (n < 0 || n > 10);
        return n;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char resp;
        do {
            double n1 = lerNota(in, "Nota da 1ª avaliação");
            double n2 = lerNota(in, "Nota da 2ª avaliação");
            System.out.printf("Média: %.2f%n", (n1 + n2) / 2);
            System.out.print("NOVO CÁLCULO (S/N)? ");
            resp = Character.toUpperCase(in.next().charAt(0));
        } while (resp == 'S');
    }
}
