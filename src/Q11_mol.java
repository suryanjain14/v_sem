public class Q11_mol {

    public static int ar(int no) {
        int ar = no * no;
        return ar;
    }

    public static int ar(int no, int no1) {
        int ar = no * no1;
        return ar;
    }

    public static void main(String[] args) {

        int no = 4, no1 = 5, ar;
        ar = ar(no);
        System.out.println("area of square" + ar);
        ar = ar(no, no1);
        System.out.println("area of rec " + ar);
    }

}
