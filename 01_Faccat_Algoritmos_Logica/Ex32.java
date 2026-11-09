import java.util.Scanner;
public class Ex32 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nome do time 1: ");
        String t1 = in.nextLine();
        System.out.print("Gols do time 1: ");
        int g1 = in.nextInt();
        in.nextLine();
        System.out.print("Nome do time 2: ");
        String t2 = in.nextLine();
        System.out.print("Gols do time 2: ");
        int g2 = in.nextInt();
        if (g1 > g2) System.out.println("Vencedor: " + t1);
        else if (g2 > g1) System.out.println("Vencedor: " + t2);
        else System.out.println("EMPATE");
    }
}
