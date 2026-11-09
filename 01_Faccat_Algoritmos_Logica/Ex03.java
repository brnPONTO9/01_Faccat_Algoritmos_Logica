public class Ex03 {
    public static void main(String[] args) {
        // Java usa divisão inteira entre int; por isso usamos double (4.0/2.0)
        double a1 = (4.0 / 2) + (2.0 / 4), a2 = 4.0 / 2 + 2.0 / 4;
        System.out.println("A: " + a1 + " e " + a2 + " -> " + (a1 == a2 ? "MESMO resultado" : "resultados DIFERENTES"));
        double b1 = 4.0 / (2 + 2) / 4, b2 = 4.0 / 2 + 2.0 / 4;
        System.out.println("B: " + b1 + " e " + b2 + " -> " + (b1 == b2 ? "MESMO resultado" : "resultados DIFERENTES"));
        int c1 = (4 + 2) * 2 - 4, c2 = 4 + 2 * 2 - 4;
        System.out.println("C: " + c1 + " e " + c2 + " -> " + (c1 == c2 ? "MESMO resultado" : "resultados DIFERENTES"));
    }
}
