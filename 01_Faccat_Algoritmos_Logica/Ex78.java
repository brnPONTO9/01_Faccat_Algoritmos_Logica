import java.util.Scanner;
public class Ex78 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] nomes = new String[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nomes[i] = in.nextLine();
        }
        System.out.print("Nome a procurar: ");
        String busca = in.nextLine();
        boolean achou = false;
        for (String n : nomes) if (n.equalsIgnoreCase(busca)) { achou = true; break; }
        System.out.println(achou ? "ACHEI" : "NÃO ACHEI");
    }
}
