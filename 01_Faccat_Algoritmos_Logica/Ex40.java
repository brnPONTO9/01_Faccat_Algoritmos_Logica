import java.util.Scanner;
public class Ex40 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Produto: ");
        String nome = in.nextLine();
        System.out.print("Quantidade: ");
        int qtd = in.nextInt();
        System.out.print("Preço unitário: ");
        double preco = in.nextDouble();
        double total = qtd * preco;
        double perc = qtd <= 5 ? 0.02 : qtd <= 10 ? 0.03 : 0.05;
        double desconto = total * perc;
        System.out.printf("%s - Total: %.2f | Desconto: %.2f | Total a pagar: %.2f%n", nome, total, desconto, total - desconto);
    }
}
