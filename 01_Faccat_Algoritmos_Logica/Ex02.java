public class Ex02 {
    public static void main(String[] args) {
        // a)
        int a = 10, b = 20;
        System.out.println("a) " + b);          // 20
        b = 5;
        System.out.println("a) " + a + " " + b);  // 10 5
        // b)
        a = 30; b = 20;
        int c = a + b;
        System.out.println("b) " + c);           // 50
        b = 10;
        System.out.println("b) " + b + " " + c);  // 10 50
        c = a + b;
        System.out.println("b) " + a + " " + b + " " + c); // 30 10 40
        // c)
        a = 10; b = 20; c = a; b = c; a = b;
        System.out.println("c) " + a + " " + b + " " + c); // 10 10 10
        // d)
        a = 10; b = a + 1; a = b + 1; b = a + 1;
        System.out.println("d) " + a);           // 12
        a = b + 1;
        System.out.println("d) " + a + " " + b); // 14 13
        // e)
        a = 10; b = 5; c = a + b; b = 20; a = 10;
        System.out.println("e) " + a + " " + b + " " + c); // 10 20 15
        // f)
        int x = 1, y = 2, z = y - x;
        System.out.println("f) " + z);           // 1
        x = 5; y = x + z;
        System.out.println("f) " + x + " " + y + " " + z); // 5 6 1
    }
}
