import java.util.Scanner;
public class Ex56 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        do {
            System.out.print("Valor (1 a 10): ");
            n = in.nextInt();
        } while (n < 1 || n > 10);
        for (int i = 1; i <= 10; i++) System.out.println(n + " x " + i + " = " + n * i);
    }
}
