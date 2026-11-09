import java.util.*;
public class Raciocinio3_JesuitasCanibais {
    // estado: jesuítas e canibais na margem esquerda + posição do barco (0 = esquerda)
    record Estado(int j, int c, int barco) {
        boolean valido() {
            if (j < 0 || c < 0 || j > 3 || c > 3) return false;
            int jd = 3 - j, cd = 3 - c;
            return (j == 0 || j >= c) && (jd == 0 || jd >= cd);
        }
    }
    public static void main(String[] args) {
        Estado ini = new Estado(3, 3, 0), fim = new Estado(0, 0, 1);
        Map<Estado, Estado> pai = new HashMap<>();
        Deque<Estado> fila = new ArrayDeque<>();
        fila.add(ini);
        pai.put(ini, null);
        int[][] viagens = {{1, 0}, {2, 0}, {0, 1}, {0, 2}, {1, 1}};
        while (!fila.isEmpty()) { // busca em largura => menor sequência
            Estado e = fila.poll();
            if (e.equals(fim)) break;
            for (int[] v : viagens) {
                int s = e.barco() == 0 ? -1 : 1;
                Estado n = new Estado(e.j() + s * v[0], e.c() + s * v[1], 1 - e.barco());
                if (n.valido() && !pai.containsKey(n)) { pai.put(n, e); fila.add(n); }
            }
        }
        LinkedList<Estado> caminho = new LinkedList<>();
        for (Estado e = fim; e != null; e = pai.get(e)) caminho.addFirst(e);
        for (int i = 1; i < caminho.size(); i++) {
            Estado a = caminho.get(i - 1), b = caminho.get(i);
            int dj = Math.abs(a.j() - b.j()), dc = Math.abs(a.c() - b.c());
            System.out.println("Viagem " + i + ": " + dj + " jesuíta(s) e " + dc + " canibal(is) "
                    + (a.barco() == 0 ? "->" : "<-"));
        }
    }
}
