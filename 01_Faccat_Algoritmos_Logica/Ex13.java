import java.util.Scanner;
public class Ex13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nota 1: ");
        double n1 = in.nextDouble();
        System.out.print("Nota 2: ");
        double n2 = in.nextDouble();
        System.out.print("Nota 3: ");
        double n3 = in.nextDouble();
        System.out.printf("Média final: %.2f%n", (n1 * 2 + n2 * 3 + n3 * 5) / 10);
    }
}
