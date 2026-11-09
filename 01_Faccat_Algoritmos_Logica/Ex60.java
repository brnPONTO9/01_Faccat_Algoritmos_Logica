import java.util.Scanner;
public class Ex60 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dentro = 0, fora = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Valor " + i + ": ");
            double v = in.nextDouble();
            if (v >= 10 && v <= 20) dentro++;
            else fora++;
        }
        System.out.println("Dentro de [10,20]: " + dentro + " | Fora: " + fora);
    }
}
