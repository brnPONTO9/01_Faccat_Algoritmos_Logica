import java.util.Scanner;
public class Ex46 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Primeiro valor: ");
        double a = in.nextDouble();
        double b;
        do {
            System.out.print("Segundo valor: ");
            b = in.nextDouble();
            if (b == 0) System.out.println("VALOR INVÁLIDO");
        } while (b == 0);
        System.out.println("Divisão: " + a / b);
    }
}
