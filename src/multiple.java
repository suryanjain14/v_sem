import java.util.Scanner;
public class multiple {
    public static void main(String[] args) {
        int a,b;
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter a");
        a=inp.nextInt();
        System.out.println("Enter b");
        b=inp.nextInt();
        if(a%b==0){
            System.out.println("a is multiple of b");
        }
        else
        {
            System.out.println("a is not a multiple of b");
        }

    }

}
