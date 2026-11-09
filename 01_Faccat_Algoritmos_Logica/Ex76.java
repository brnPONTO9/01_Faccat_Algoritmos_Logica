public class Ex76 {
    static char[][] tela = new char[10][60];
    // simula o comando posiciona(x,y) + escrever; x = coluna, y = linha (a partir de 1)
    static void posiciona(int x, int y, char c) { tela[y - 1][x - 1] = c; }
    public static void main(String[] args) {
        for (char[] linha : tela) java.util.Arrays.fill(linha, ' ');
        for (int x = 1; x <= 60; x++) { posiciona(x, 1, '+'); posiciona(x, 10, '+'); }
        for (int y = 2; y <= 9; y++) { posiciona(1, y, '+'); posiciona(60, y, '+'); }
        for (char[] linha : tela) System.out.println(new String(linha));
    }
}
