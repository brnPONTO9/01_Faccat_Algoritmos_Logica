import java.util.Scanner;
public class Ex69 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double total = 0;
        int n = 0;
        char resp;
        do {
            System.out.print("Valor da mercadoria: ");
            total += in.nextDouble();
            n++;
            System.out.print("MAIS MERCADORIAS (S/N)? ");
            resp = Character.toUpperCase(in.next().charAt(0));
        } while (resp == 'S');
        System.out.printf("Valor total em estoque: %.2f%n", total);
        System.out.printf("Média de valor: %.2f%n", total / n);
    }
}
