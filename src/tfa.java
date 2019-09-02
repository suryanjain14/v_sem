public class tfa {

    public static void main(String[] args) {
        int[] arr = {3, 6, 2};
        tfa obj = new tfa();
        System.out.println(obj.doit(arr[1], obj.doit(arr[2], arr[0])));
        System.out.println(obj.doit(2, 3));
        System.out.println(obj.doit(6, 32));


        int n = 6;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < ((n - i) - 1); ++j) {
                System.out.print(" ");
            }
            for (int k = 0; k < (i + 1); ++k) {
                System.out.print("#");
            }
            System.out.print("\n");
        }
    }

    public int doit(int m, int n) {
        m = m + n;
        System.out.println(m);
        System.out.println(n);
        System.out.println(m);
        return (10 * m + n);

    }
}
