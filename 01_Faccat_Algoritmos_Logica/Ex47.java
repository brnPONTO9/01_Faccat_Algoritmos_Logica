import java.util.Scanner;
public class Ex47 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Primeiro valor: ");
        double a = in.nextDouble();
        System.out.print("Segundo valor: ");
        double b = in.nextDouble();
        while (b == 0) {
            System.out.println("VALOR INVÁLIDO");
            System.out.print("Segundo valor: ");
            b = in.nextDouble();
        }
        System.out.println("Divisão: " + a / b);
    }
}
