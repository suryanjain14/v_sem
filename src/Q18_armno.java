import java.util.Scanner;
import java.lang.Math;

public class Q18_armno {
    public static void main(String[] args) {
        int no, check1 = 0, sum = 0, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no to check weather it's armstrong or not \n no = ");
        no = sc.nextInt();
        temp = no;

        for (int k = 0; no > 0; k++) {
            int j = no % 10;
            sum = j * j * j + sum;
            no = no / 10;
        }
        if (sum == temp) {
            System.out.println("armstrong no");
        } else
            System.out.println("nahi hai");
    }
}
