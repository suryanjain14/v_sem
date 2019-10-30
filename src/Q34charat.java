public class Q34charat {

    public static void main(String[] args) {
        String str = "the quick brown fox jumped up the lazy dog";
        StringBuffer strRevrse = new StringBuffer();

        char b = str.charAt(1);
        for (int j = str.length() - 1; j >= 0; j--) {
            strRevrse.append(str.charAt(j));
        }
        System.out.println(strRevrse);
    }
}
