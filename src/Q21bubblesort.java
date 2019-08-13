public class Q21bubblesort {
    public static void main(String[] args) {
        int[] a = {3, 5, 1, 4, 2};
        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                if (a[i] > a[j]) {
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }
    }
}
