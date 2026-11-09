import java.util.Scanner;
/*
 * Erros do algoritmo original:
 * 1) Nunca lê a altura (falta "ler altura") e a usa no cálculo.
 * 2) Falta o operador de atribuição (<-) em "peso_ideal (72.7 * altura) - 58".
 * 3) Usou "–" (travessão) em vez de "-" na fórmula feminina.
 * 4) Escreve peso_ideal mas não mostra o nome lido.
 * 5) Falta o "entao" tratado de forma correta e a comparação de sexo
 *    deveria ser com texto/caractere 'M' (aspas).
 * A versão abaixo está corrigida.
 */
public class Ex23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = in.nextLine();
        System.out.print("Altura: ");
        double altura = in.nextDouble();
        System.out.print("Sexo (M/F): ");
        char sexo = Character.toUpperCase(in.next().charAt(0));
        double pesoIdeal;
        if (sexo == 'M') pesoIdeal = (72.7 * altura) - 58;
        else pesoIdeal = (62.1 * altura) - 44.7;
        System.out.printf("%s, seu peso ideal é %.2f kg%n", nome, pesoIdeal);
    }
}
