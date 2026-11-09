import java.util.Scanner;
public class Ex63 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double soma = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Número " + i + ": ");
            soma += in.nextDouble();
        }
        System.out.println("Soma total: " + soma);
    }
}
