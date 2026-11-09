import java.util.Scanner;
public class Ex31 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Lados A, B e C: ");
        double a = in.nextDouble(), b = in.nextDouble(), c = in.nextDouble();
        if (a < b + c && b < a + c && c < a + b) System.out.println("Formam um triângulo");
        else System.out.println("Não formam um triângulo");
    }
}
