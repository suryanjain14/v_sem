public class Q20selectionsort {
    public static void main(String[] args) {
        int min, loc;
        int[] a = {3, 4, 6, 5, 2, 1};
        for (int i = 0; i < 6; i++) {
            loc = i;
            for (int j = i; j < 6; j++) {
                if (a[j] < a[loc]) {

                    loc = j;
                }
            }

            int temp = a[loc];
            a[loc] = a[i];
            a[i] = temp;
            System.out.println(a[i]);
        }
    }
}
