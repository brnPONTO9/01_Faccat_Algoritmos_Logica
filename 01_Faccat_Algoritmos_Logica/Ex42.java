import java.util.Scanner;
public class Ex42 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Código do empregado: ");
        int codigo = in.nextInt();
        System.out.print("Ano de nascimento: ");
        int nasc = in.nextInt();
        System.out.print("Ano de ingresso: ");
        int ingresso = in.nextInt();
        int anoAtual = java.time.Year.now().getValue();
        int idade = anoAtual - nasc, tempo = anoAtual - ingresso;
        System.out.println("Empregado " + codigo + " - idade: " + idade + " - tempo de trabalho: " + tempo);
        boolean pode = idade >= 65 || tempo >= 30 || (idade >= 60 && tempo >= 25);
        System.out.println(pode ? "Requerer aposentadoria" : "Não requerer");
    }
}
