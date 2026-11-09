import java.util.Scanner;
public class Ex20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Primeiro valor: ");
        double a = in.nextDouble();
        System.out.print("Segundo valor: ");
        double b = in.nextDouble();
        if (a < b) System.out.println(a + " " + b);
        else System.out.println(b + " " + a);
    }
}
