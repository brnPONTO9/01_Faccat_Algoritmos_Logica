import java.util.Scanner;
public class Ex29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Três valores: ");
        double a = in.nextDouble(), b = in.nextDouble(), c = in.nextDouble();
        double menor = Math.min(a, Math.min(b, c));
        System.out.println("Soma dos 2 maiores: " + (a + b + c - menor));
    }
}
