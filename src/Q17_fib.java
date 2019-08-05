public class Q17_fib {

    public static void main(String[] args) {
        int a1 = 0, a2 = 1, b;

        for (int i = 0; i < 10; i++) {
            b = a2;
            a2 = a1 + a2;
            a1 = b;
            System.out.println("a2 =" + a2);
        }
    }
}
