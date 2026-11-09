import java.util.Scanner;
public class Ex11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Carros vendidos: ");
        int carros = in.nextInt();
        System.out.print("Valor total das vendas: ");
        double vendas = in.nextDouble();
        System.out.print("Salário fixo: ");
        double fixo = in.nextDouble();
        System.out.print("Comissão por carro: ");
        double porCarro = in.nextDouble();
        double salario = fixo + porCarro * carros + vendas * 0.05;
        System.out.printf("Salário final: %.2f%n", salario);
    }
}
