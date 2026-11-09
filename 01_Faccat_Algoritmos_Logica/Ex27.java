import java.util.Scanner;
public class Ex27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Valor: ");
        double v = in.nextDouble();
        if (v > 0) System.out.println("Positivo");
        else if (v < 0) System.out.println("Negativo");
        else System.out.println("Zero");
    }
}
