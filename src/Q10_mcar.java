public class Q10_mcar {

    public static int fact(int no, int fac, int rec) {
        rec++;
        fac = fac * no;
        if (no == 1) {
            return rec,fac);//problem baad me dhekha jye ga
        }
        no--;
        fact(no, fac, rec);
        return 0;
    }

    public static void main(String[] args) {
        int rec;//this variavle will store how many time the method was called
        int no = 5, fac = 1;
        int temp = fact(no, fac, rec);

    }


}
