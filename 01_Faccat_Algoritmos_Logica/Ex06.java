import java.util.Scanner;
public class Ex06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Base: ");
        double base = in.nextDouble();
        System.out.print("Altura: ");
        double altura = in.nextDouble();
        System.out.println("Área: " + base * altura);
    }
}
