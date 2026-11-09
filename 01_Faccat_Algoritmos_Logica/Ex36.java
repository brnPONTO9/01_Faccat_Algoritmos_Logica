import java.util.Scanner;
public class Ex36 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Idades dos 2 homens: ");
        int h1 = in.nextInt(), h2 = in.nextInt();
        System.out.print("Idades das 2 mulheres: ");
        int m1 = in.nextInt(), m2 = in.nextInt();
        int homemVelho = Math.max(h1, h2), homemNovo = Math.min(h1, h2);
        int mulherVelha = Math.max(m1, m2), mulherNova = Math.min(m1, m2);
        System.out.println("Soma (homem mais velho + mulher mais nova): " + (homemVelho + mulherNova));
        System.out.println("Produto (homem mais novo * mulher mais velha): " + (homemNovo * mulherVelha));
    }
}
