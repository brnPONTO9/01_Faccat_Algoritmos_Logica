public class Raciocinio1_Rio {
    public static void main(String[] args) {
        // Solução clássica: o homem, o cachorro, a galinha e o milho
        // (cachorro come galinha; galinha come milho, se ficarem sozinhos)
        String[] passos = {
            "1. Leva a GALINHA para o outro lado e volta sozinho.",
            "2. Leva o CACHORRO para o outro lado.",
            "3. Volta trazendo a GALINHA.",
            "4. Deixa a galinha, leva o MILHO para o outro lado.",
            "5. Volta sozinho.",
            "6. Leva a GALINHA de novo para o outro lado."
        };
        for (String p : passos) System.out.println(p);
    }
}
