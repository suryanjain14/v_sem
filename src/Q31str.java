public class Q31str {

    public static void main(String[] args) {
        String str = "daslkdas asdha ksd KAS";

        int i = 0, n = 0, j = 0, no = 0;

        for (j = 0; j < str.length(); j++) {
            i = str.indexOf('k', n);
            if (i > n) {
                n = i;
                no++;
            }

        }

        System.out.println(no);
    }
}
