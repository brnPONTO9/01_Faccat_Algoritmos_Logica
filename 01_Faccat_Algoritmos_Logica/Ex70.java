import java.util.Scanner;
public class Ex70 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double maior = 0, menor = 0;
        for (int i = 1; i <= 100; i++) {
            System.out.print("Valor " + i + ": ");
            double v = in.nextDouble();
            if (i == 1 || v > maior) maior = v;
            if (i == 1 || v < menor) menor = v;
        }
        System.out.println("Maior: " + maior + " | Menor: " + menor);
    }
}
