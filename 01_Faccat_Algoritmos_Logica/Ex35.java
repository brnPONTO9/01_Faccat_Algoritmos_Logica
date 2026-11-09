import java.util.Scanner;
public class Ex35 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Litros: ");
        double litros = in.nextDouble();
        System.out.print("Tipo (A-álcool, G-gasolina): ");
        char tipo = Character.toUpperCase(in.next().charAt(0));
        double preco, desconto;
        if (tipo == 'A') { preco = 2.90; desconto = litros <= 20 ? 0.03 : 0.05; }
        else if (tipo == 'G') { preco = 3.30; desconto = litros <= 20 ? 0.04 : 0.06; }
        else { System.out.println("Tipo inválido"); return; }
        double total = litros * preco;
        System.out.printf("Valor a pagar: R$ %.2f%n", total - total * desconto);
    }
}
