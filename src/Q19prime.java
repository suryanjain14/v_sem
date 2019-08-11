import java.util.Scanner;

public class Q19prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no");
        boolean a = true;
        int no = sc.nextInt();
        System.out.println(no);
        for (int i = 2; i < no; i++) {
            if (no % i == 0) {
                a = false;
                break;
            }
        }

        if (a)
            System.out.println(no + " is prime");
        else
            System.out.println(no + " is not prime");
    }
}
