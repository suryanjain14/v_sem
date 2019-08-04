public class Q9_ctrstat {

    public static void main(String[] args) {
        //LOOPS
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

        //DECISION MAKING STATEMENTS:

        //if,if else, else
        int a = 0, b = 3, c = 9;
        if (a == 2) {
            System.out.println("if");
        } else if (a == 0) {
            System.out.println("if else");
        } else
            System.out.println("else");

        //BRANCHING STATEMENTS:
        //break
        for (i = 0; i < 5; i++) {
            if (i == 2)
                break;
            System.out.println(" break no is " + i);
        }
        //continue
        for (i = 0; i < 5; i++) {
            if (i == 2)
                continue;
            System.out.println("continue no is " + i);
        }


    }
}


