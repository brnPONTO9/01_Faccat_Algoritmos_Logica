import java.util.Scanner;
public class Ex28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Três valores: ");
        double a = in.nextDouble(), b = in.nextDouble(), c = in.nextDouble();
        double maior;
        if (a > b) maior = a > c ? a : c;
        else maior = b > c ? b : c;
        System.out.println("Maior: " + maior);
    }
}
