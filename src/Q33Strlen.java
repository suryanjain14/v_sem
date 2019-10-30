public class Q33Strlen {
    public static void main(String[] args) {
        String str = "the quick brown fox jump up the lazy dog";
        int no = 0;
        for (char x : str.toCharArray()) {
            no++;
        }
        System.out.println(no);
    }
}
