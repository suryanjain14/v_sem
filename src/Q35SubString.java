public class Q35SubString {
    public static void main(String[] args) {
        String str = "the quick brown fox jump up the lazy dog";
        int end = str.length();
        for (int start = 0; start < str.length(); start++) {
            String Temp = str.substring(start, end);
            if (Temp.startsWith("quick")) {
                for (int j = Temp.length(); j > start; j--) {
                    String temp = Temp.substring(0, j);
                    if (temp.endsWith("up")) {
                        System.out.println(temp);
                    }
                }
            }
        }
    }
}