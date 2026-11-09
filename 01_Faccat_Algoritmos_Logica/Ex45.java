import java.util.Scanner;
public class Ex45 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Primeiro valor: ");
        double a = in.nextDouble();
        System.out.print("Segundo valor (diferente de zero): ");
        double b = in.nextDouble();
        while (b == 0) { // ENQUANTO
            System.out.print("Segundo valor (diferente de zero): ");
            b = in.nextDouble();
        }
        System.out.println("Divisão: " + a / b);
    }
}
