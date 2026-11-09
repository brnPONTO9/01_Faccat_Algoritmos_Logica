import java.util.Scanner;
public class Ex66 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Primeiro valor: ");
        int a = in.nextInt();
        System.out.print("Segundo valor: ");
        int b = in.nextInt();
        int ini = Math.min(a, b), fim = Math.max(a, b);
        long soma = 0;
        for (int i = ini; i <= fim; i++) soma += i;
        System.out.println("Soma: " + soma);
    }
}
