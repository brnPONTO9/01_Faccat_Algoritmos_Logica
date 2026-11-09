import java.util.Scanner;
public class Ex65 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Primeiro valor: ");
        int a = in.nextInt();
        System.out.print("Segundo valor (maior): ");
        int b = in.nextInt();
        long soma = 0;
        for (int i = a; i <= b; i++) soma += i;
        System.out.println("Soma: " + soma);
    }
}
