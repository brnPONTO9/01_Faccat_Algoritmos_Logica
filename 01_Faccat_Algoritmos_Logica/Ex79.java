import java.util.Scanner;
public class Ex79 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] notas = new double[20];
        double soma = 0;
        for (int i = 0; i < 20; i++) {
            System.out.print("Nota do aluno " + (i + 1) + ": ");
            notas[i] = in.nextDouble();
            soma += notas[i];
        }
        double media = soma / 20;
        int acima = 0;
        for (double n : notas) if (n > media) acima++;
        System.out.printf("Média da turma: %.2f | Alunos acima da média: %d%n", media, acima);
    }
}
