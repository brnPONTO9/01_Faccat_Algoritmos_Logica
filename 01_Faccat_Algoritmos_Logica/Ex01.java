public class Ex01 {
    public static void main(String[] args) {
        int a = 10, b = 20;
        int aux = a; // troca usando apenas atribuições entre variáveis
        a = b;
        b = aux;
        System.out.println("A = " + a + " B = " + b);
    }
}
