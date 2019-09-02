public class Q27vrangs {
    static void sum(int... a) {
        int sum = 0;
        for (int x : a) {
            sum = x + sum;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        sum(1, 2, 3, 4);

    }
}
