import java.util.Scanner;
public class Ex07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Anos: ");
        int anos = in.nextInt();
        System.out.print("Meses: ");
        int meses = in.nextInt();
        System.out.print("Dias: ");
        int dias = in.nextInt();
        System.out.println("Idade em dias: " + (anos * 365 + meses * 30 + dias));
    }
}
