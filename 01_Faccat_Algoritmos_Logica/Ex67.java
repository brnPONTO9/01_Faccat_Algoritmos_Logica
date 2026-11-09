public class Ex67 {
    public static void main(String[] args) {
        int soma = 0, qtd = 0;
        for (int i = 15; i <= 100; i++) { soma += i; qtd++; }
        System.out.println("Média: " + (double) soma / qtd);
    }
}
