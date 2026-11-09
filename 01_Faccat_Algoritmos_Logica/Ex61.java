import java.util.Scanner;
public class Ex61 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double soma = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Valor " + i + ": ");
            soma += in.nextDouble();
        }
        System.out.println("Média: " + soma / 10);
    }
}
