public class Raciocinio2_Hanoi {
    static int movimentos = 0;
    static void hanoi(int n, char origem, char destino, char aux) {
        if (n == 0) return;
        hanoi(n - 1, origem, aux, destino);
        System.out.println(++movimentos + ". Mover disco " + n + " da haste " + origem + " para " + destino);
        hanoi(n - 1, aux, destino, origem);
    }
    public static void main(String[] args) {
        hanoi(3, 'A', 'C', 'B'); // 3 discos => 2^3 - 1 = 7 movimentos
    }
}
