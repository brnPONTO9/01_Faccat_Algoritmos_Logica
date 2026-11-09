import java.util.Scanner;
public class Ex44 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Primeiro valor: ");
        double a = in.nextDouble();
        double b;
        do { // REPITA ... ATÉ b != 0
            System.out.print("Segundo valor (diferente de zero): ");
            b = in.nextDouble();
        } while (b == 0);
        System.out.println("Divisão: " + a / b);
    }
}
