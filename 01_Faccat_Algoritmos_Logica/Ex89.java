import java.util.Scanner;
public class Ex89 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] v1 = new double[15], v2 = new double[15];
        for (int i = 0; i < 15; i++) { System.out.print("V1[" + (i + 1) + "]: "); v1[i] = in.nextDouble(); }
        for (int i = 0; i < 15; i++) { System.out.print("V2[" + (i + 1) + "]: "); v2[i] = in.nextDouble(); }
        int iguais = 0;
        for (int i = 0; i < 15; i++) if (v1[i] == v2[i]) iguais++;
        System.out.println("Mesmos números nas mesmas posições: " + iguais);
    }
}
