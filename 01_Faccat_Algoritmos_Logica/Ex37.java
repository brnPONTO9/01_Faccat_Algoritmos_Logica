import java.util.Scanner;
public class Ex37 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Kg de morangos: ");
        double morango = in.nextDouble();
        System.out.print("Kg de maçãs: ");
        double maca = in.nextDouble();
        double pMorango = morango <= 5 ? 2.50 : 2.20;
        double pMaca = maca <= 5 ? 1.80 : 1.50;
        double total = morango * pMorango + maca * pMaca;
        if (morango + maca > 8 || total > 25) total *= 0.90;
        System.out.printf("Valor a pagar: R$ %.2f%n", total);
    }
}
