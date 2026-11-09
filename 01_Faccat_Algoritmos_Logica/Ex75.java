public class Ex75 {
    public static void main(String[] args) {
        for (int a = 1; a <= 10; a++) {
            StringBuilder sb = new StringBuilder(a + ",");
            for (int b = 1; b <= 10; b++) sb.append(' ').append(b);
            System.out.println(sb);
        }
    }
}
