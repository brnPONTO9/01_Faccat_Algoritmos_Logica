import java.util.Scanner;
public class Ex59 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int negativos = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Valor " + i + ": ");
            if (in.nextDouble() < 0) negativos++;
        }
        System.out.println("Negativos: " + negativos);
    }
}
