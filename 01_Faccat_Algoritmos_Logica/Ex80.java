import java.util.Scanner;
public class Ex80 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] q = new double[20];
        for (int i = 0; i < 20; i++) {
            do {
                System.out.print("Q[" + (i + 1) + "] (positivo): ");
                q[i] = in.nextDouble();
            } while (q[i] <= 0);
        }
        int pos = 0;
        for (int i = 1; i < 20; i++) if (q[i] > q[pos]) pos = i;
        System.out.println("Maior: " + q[pos] + " na posição " + (pos + 1));
    }
}
