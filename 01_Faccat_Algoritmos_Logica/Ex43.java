public class Ex43 {
    public static void main(String[] args) {
        int[][] testes = {{1, 2, 3}, {3, 4, 5}, {2, 2, 4}, {4, 4, 4}, {5, 3, 3}};
        System.out.println("a\tb\tc\tmens");
        for (int[] t : testes) {
            int a = t[0], b = t[1], c = t[2];
            String mens;
            if (a < b + c && b < a + c && c < a + b) {
                if (a == b && b == c) mens = "Triângulo Equilátero";
                else if (a == b || b == c || a == c) mens = "Triângulo Isósceles";
                else mens = "Triângulo Escaleno";
            } else mens = "Não é possível formar um triângulo";
            System.out.println(a + "\t" + b + "\t" + c + "\t" + mens);
        }
        // Obs.: o quadro da apostila perdeu o alinhamento no PDF; os valores acima
        // são os pares (a,b,c) = (1,2,3), (3,4,5), (2,2,4), (4,4,4), (5,3,3).
    }
}
