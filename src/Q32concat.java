public class Q32concat {

    String str1 = "the lazy fox1 jumped up the quick brown dog", str2 = " --> second the lazy fox 2 jumped up the quick brown dog";

    public static void main(String[] args) {
        Q32concat obj = new Q32concat();

        String st = obj.str1.concat(obj.str2);
        System.out.println(st);
    }


}
