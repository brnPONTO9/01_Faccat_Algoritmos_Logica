import java.util.Scanner;
public class Ex19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Primeiro valor: ");
        double a = in.nextDouble();
        System.out.print("Segundo valor: ");
        double b = in.nextDouble();
        System.out.println("Maior: " + (a > b ? a : b));
    }
}
