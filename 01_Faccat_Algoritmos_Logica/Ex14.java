import java.util.Scanner;
public class Ex14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Valor: ");
        double v = in.nextDouble();
        System.out.println(v > 10 ? "É MAIOR QUE 10!" : "NÃO É MAIOR QUE 10!");
    }
}
