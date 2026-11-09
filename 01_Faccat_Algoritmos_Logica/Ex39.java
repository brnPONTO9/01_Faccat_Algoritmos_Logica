public class Ex39 {
    public static void main(String[] args) {
        boolean A = true, B = true, C = false;
        // xou (ou exclusivo) = operador ^ em Java
        System.out.println("a) " + ((A && B) || (A ^ B)));            // V
        System.out.println("b) " + ((A || B) && (A && C)));           // F
        // c) precedência: não > e > xou > ou  =>  A ou (C e B) xou (A e (não B))
        System.out.println("c) " + (A || ((C && B) ^ (A && !B))));    // V
    }
}
