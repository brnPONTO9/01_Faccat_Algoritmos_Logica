import java.util.Scanner;
public class Ex85 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dias = 365;
        double[] t = new double[dias];
        double soma = 0;
        for (int i = 0; i < dias; i++) {
            System.out.print("Temperatura média do dia " + (i + 1) + ": ");
            t[i] = in.nextDouble();
            soma += t[i];
        }
        double menor = t[0], maior = t[0], media = soma / dias;
        int abaixo = 0;
        for (double v : t) {
            if (v < menor) menor = v;
            if (v > maior) maior = v;
            if (v < media) abaixo++;
        }
        System.out.printf("a) Menor: %.1f%nb) Maior: %.1f%nc) Média anual: %.2f%nd) Dias abaixo da média: %d%n", menor, maior, media, abaixo);
    }
}
