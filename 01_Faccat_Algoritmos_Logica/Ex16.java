import java.util.Scanner;
public class Ex16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Quantidade de maçãs: ");
        int qtd = in.nextInt();
        double preco = qtd < 12 ? 1.30 : 1.00;
        System.out.printf("Custo total: R$ %.2f%n", qtd * preco);
    }
}
