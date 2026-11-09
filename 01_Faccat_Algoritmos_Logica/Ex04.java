public class Ex04 {
    public static void main(String[] args) {
        // expressões originais (esq.) e reescritas com o mínimo de parênteses (dir.)
        System.out.println("A: " + (6 * (3 + 2)) + "  ->  6*(3+2)");
        System.out.println("B: " + (2 + (6 * (3 + 2))) + "  ->  2+6*(3+2)");
        System.out.println("C: " + (2 + (3 * 6) / (2 + 4)) + "  ->  2+3*6/(2+4)");
        System.out.println("D: " + (2 * (8 / (3 + 1))) + "  ->  2*8/(3+1)");
        System.out.println("E: " + (3 + (16 - 2) / (2 * (9 - 2))) + "  ->  3+(16-2)/(2*(9-2))");
        System.out.println("F: " + ((6 / 3) + (8 / 2)) + "  ->  6/3+8/2");
        System.out.println("G: " + (((3 + (8 / 2)) * 4) + (3 * 2)) + "  ->  (3+8/2)*4+3*2");
        System.out.println("H: " + ((6 * (3 * 3) + 6) - 10) + "  ->  6*3*3+6-10");
        System.out.println("I: " + (((10 * 8) + 3) * 9) + "  ->  (10*8+3)*9");
        System.out.println("J: " + (((-12) * (-4)) + (3 * (-4))) + "  ->  -12*-4+3*-4");
    }
}
