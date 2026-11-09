import java.util.Scanner;
public class Ex22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Horas trabalhadas no mês: ");
        double horas = in.nextDouble();
        System.out.print("Salário por hora: ");
        double valorHora = in.nextDouble();
        double limite = 40 * 4; // 4 semanas de 40h
        double salario;
        if (horas > limite) salario = limite * valorHora + (horas - limite) * valorHora * 1.5;
        else salario = horas * valorHora;
        System.out.printf("Salário total: %.2f%n", salario);
    }
}
