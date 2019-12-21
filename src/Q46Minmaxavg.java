import java.util.Scanner;

public class Q46Minmaxavg {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter numbers a,b,c");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        int avg = (a + b + c) / 3;
        int product = (a * b * c);
        System.out.println("avg" + avg + "   product" + product);
        int min = a < b && a < c ? a : ((b < c && b < a) ? b : c);
        int max = a > b && a > c ? a : ((b > c && b > a) ? b : c);
        System.out.println("min: " + min + " max: " + max);
    }
}
