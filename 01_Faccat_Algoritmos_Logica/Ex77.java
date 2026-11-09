import java.util.Arrays;
public class Ex77 {
    public static void main(String[] args) {
        int[] v = new int[9]; // índice 0 não usado: posições 1..8 como na apostila
        int[] ini = {5, 1, 4, 2, 7, 8, 3, 6};
        for (int i = 0; i < 8; i++) v[i + 1] = ini[i];
        for (int i = 8; i >= 5; i--) {
            int aux = v[i];
            v[i] = v[8 - i + 1];
            v[8 - i + 1] = aux;
        }
        v[3] = v[1];
        v[v[3]] = v[v[2]];
        System.out.println(Arrays.toString(Arrays.copyOfRange(v, 1, 9)));
    }
}
