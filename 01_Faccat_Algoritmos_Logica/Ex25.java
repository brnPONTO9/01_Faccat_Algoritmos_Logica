import java.util.Scanner;
public class Ex25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Número da conta: ");
        int conta = in.nextInt();
        System.out.print("Saldo: ");
        double saldo = in.nextDouble();
        System.out.print("Débito: ");
        double debito = in.nextDouble();
        System.out.print("Crédito: ");
        double credito = in.nextDouble();
        double atual = saldo - debito + credito;
        System.out.printf("Conta %d - saldo atual: %.2f%n", conta, atual);
        System.out.println(atual >= 0 ? "Saldo Positivo" : "Saldo Negativo");
    }
}
