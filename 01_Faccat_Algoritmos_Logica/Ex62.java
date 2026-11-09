import java.util.Scanner;
public class Ex62 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Número de alunos: ");
        int n = in.nextInt();
        double soma = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Nota do aluno " + i + ": ");
            soma += in.nextDouble();
        }
        System.out.println(n > 0 ? "Média da turma: " + soma / n : "Turma vazia");
    }
}
