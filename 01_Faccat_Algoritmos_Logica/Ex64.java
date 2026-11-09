import java.util.Scanner;
public class Ex64 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double soma = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Número " + i + ": ");
            double v = in.nextDouble();
            if (v < 40) soma += v;
        }
        System.out.println("Soma dos valores menores que 40: " + soma);
    }
}
