import java.util.Scanner;
public class Ex83 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] v = new double[20];
        for (int i = 0; i < 20; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            v[i] = in.nextDouble();
        }
        System.out.println("Ordem inversa:");
        for (int i = 19; i >= 0; i--) System.out.println(v[i]);
    }
}
