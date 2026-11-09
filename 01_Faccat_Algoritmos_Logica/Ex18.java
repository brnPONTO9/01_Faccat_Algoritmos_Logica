import java.util.Scanner;
public class Ex18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ano atual: ");
        int atual = in.nextInt();
        System.out.print("Ano de nascimento: ");
        int nasc = in.nextInt();
        int idade = atual - nasc;
        System.out.println(idade >= 16 ? "Poderá votar este ano" : "Não poderá votar este ano");
    }
}
