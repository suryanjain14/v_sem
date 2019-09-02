public class Q24aarry {


    static void sum(int[] a) {
        int sum = 0;
        for (int x : a) {
            sum = x + sum;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {

        sum(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 12});

    }
}
