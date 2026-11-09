import java.util.Scanner;
public class Ex09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Salário atual: ");
        double salario = in.nextDouble();
        System.out.print("Percentual de reajuste: ");
        double perc = in.nextDouble();
        System.out.printf("Novo salário: %.2f%n", salario + salario * perc / 100);
    }
}
