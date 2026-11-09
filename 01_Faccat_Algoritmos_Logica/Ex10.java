import java.util.Scanner;
public class Ex10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Custo de fábrica: ");
        double custo = in.nextDouble();
        double distribuidor = custo * 0.28;
        double impostos = custo * 0.45;
        System.out.printf("Custo final ao consumidor: %.2f%n", custo + distribuidor + impostos);
    }
}
