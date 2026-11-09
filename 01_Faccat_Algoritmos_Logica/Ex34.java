public class Ex34 {
    public static void main(String[] args) {
        int[][] testes = {{3, 2}, {150, 3}, {7, -1}, {-2, 5}, {50, 3}};
        System.out.println("X\tY\tZ\tResposta");
        for (int[] t : testes) {
            int x = t[0], y = t[1];
            int z = (x * y) + 5;
            char resposta;
            if (z <= 0) resposta = 'A';
            else if (z <= 100) resposta = 'B';
            else resposta = 'C';
            System.out.println(x + "\t" + y + "\t" + z + "\t" + resposta);
        }
    }
}
