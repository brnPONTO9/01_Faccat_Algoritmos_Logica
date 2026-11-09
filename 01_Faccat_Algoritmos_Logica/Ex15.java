import java.util.Scanner;
public class Ex15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Valor: ");
        double v = in.nextDouble();
        System.out.println(v >= 0 ? "Positivo" : "Negativo");
    }
}
