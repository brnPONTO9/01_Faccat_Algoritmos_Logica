import java.util.Scanner;
public class Ex30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Três valores: ");
        double a = in.nextDouble(), b = in.nextDouble(), c = in.nextDouble();
        double t;
        if (a > b) { t = a; a = b; b = t; }
        if (b > c) { t = b; b = c; c = t; }
        if (a > b) { t = a; a = b; b = t; }
        System.out.println(a + " " + b + " " + c);
    }
}
