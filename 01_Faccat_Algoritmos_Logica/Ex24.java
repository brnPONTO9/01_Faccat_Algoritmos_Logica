import java.util.Scanner;
public class Ex24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Salário fixo: ");
        double fixo = in.nextDouble();
        System.out.print("Valor das vendas: ");
        double vendas = in.nextDouble();
        double comissao = vendas <= 1500 ? vendas * 0.03 : 1500 * 0.03 + (vendas - 1500) * 0.05;
        System.out.printf("Salário total: %.2f%n", fixo + comissao);
    }
}
