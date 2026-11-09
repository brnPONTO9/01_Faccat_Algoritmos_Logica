import java.util.Scanner;
public class Ex26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Quantidade atual em estoque: ");
        double atual = in.nextDouble();
        System.out.print("Quantidade máxima: ");
        double max = in.nextDouble();
        System.out.print("Quantidade mínima: ");
        double min = in.nextDouble();
        double media = (max + min) / 2;
        System.out.println("Quantidade média: " + media);
        System.out.println(atual >= media ? "Não efetuar compra" : "Efetuar compra");
    }
}
