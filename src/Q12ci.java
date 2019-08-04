import java.util.Scanner;

public class Q12ci {
    public static void main(String[] args) {
        int p, i, t;
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the principal");
        p = ip.nextInt();
        System.out.println("Enter the interest");
        i = ip.nextInt();
        System.out.println("Enter the time(in years)");
        t = ip.nextInt();
        for (int j = 1; j <= t; j++) {
            p = p + (p * i / 100);
        }
        System.out.println("total=" + p);

    }
}
