public class Q20selectionsort {
    public static void main(String[] args) {
        int min, loc;
        int[] a = {2, 7, 6, 1, 3, 2, 3, 43, 12, 23, 56, 76, 87, 67, 867, 45, 34, 345, 23, 8, 9, 2, 3, 4};
        for (int i = 0; i < 24; i++) {
            loc = i;
            for (int j = i; j < 24; j++) {
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
