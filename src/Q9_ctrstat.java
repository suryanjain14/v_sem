public class Q9_ctrstat {

    public static void main(String[] args) {
        //loops
        //for loop
        System.out.println("for");
        for (int i = 0; i < 5; i++) {
            System.out.println("the no is " + i);
        }

        //while
        System.out.println("while");
        int i = 0;
        while (i < 5) {
            System.out.println("The no is " + i);
            i++;
        }

        i = 0;
        //do while
        System.out.println("do while");
        do {
            System.out.println("the no is: " + i);
            i++;
        } while (i < 5);
    }
}
