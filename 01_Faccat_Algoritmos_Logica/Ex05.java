import java.util.Scanner;
public class Ex05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Valor: ");
        int v = in.nextInt();
        System.out.println("Antecessor: " + (v - 1));
    }
}
