import java.util.Scanner;
public class Ex90 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] v = new double[30];
        for (int i = 0; i < 30; i++) { System.out.print("Número " + (i + 1) + ": "); v[i] = in.nextDouble(); }
        System.out.print("Número a contar: ");
        double x = in.nextDouble();
        int cont = 0;
        for (double n : v) if (n == x) cont++;
        System.out.println(x + " aparece " + cont + " vez(es)");
    }
}
