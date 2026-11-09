import java.util.Scanner;
public class Ex54 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        do {
            System.out.print("N (maior que 0): ");
            n = in.nextInt();
        } while (n <= 0);
        for (int i = 1; i <= n; i++) System.out.println(i);
    }
}
