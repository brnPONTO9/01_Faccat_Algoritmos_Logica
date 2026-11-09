import java.util.Scanner;
public class Ex33 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Dois valores: ");
        double a = in.nextDouble(), b = in.nextDouble();
        if (a == b) System.out.println("Números iguais");
        else if (a > b) System.out.println("Primeiro é maior");
        else System.out.println("Segundo maior");
    }
}
