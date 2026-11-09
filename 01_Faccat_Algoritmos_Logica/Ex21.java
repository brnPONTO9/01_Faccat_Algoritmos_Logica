import java.util.Scanner;
public class Ex21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Hora de início (0-23): ");
        int inicio = in.nextInt();
        System.out.print("Hora de fim (0-23): ");
        int fim = in.nextInt();
        int duracao = fim > inicio ? fim - inicio : 24 - inicio + fim; // pode virar o dia
        System.out.println("Duração: " + duracao + " hora(s)");
    }
}
