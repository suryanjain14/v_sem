import java.util.Scanner;

public class Q45Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = 0, no;
        String st;
        while (temp != 2) {
            System.out.println("Enter no");
            st = sc.nextLine();
            if (st.length() == 5) {
                try {
                    no = Integer.parseInt(st);
                    for (int i = 0, j = 4; i < 5; i++, j--) {
                        char c = st.charAt(i), v = st.charAt(j);
                        if (i == 4) {
                            System.out.println("the no is palindrome");
                            temp = 2;
                        }
                        if (c == v)
                            continue;
                        else {
                            System.out.println("Not a palindrome");
                            break;
                        }
                    }
                } catch (Exception e) {
                    System.out.println("Wrong Entry\nPlease Enter Again ");
                    st = sc.nextLine();
                }


            } else {
                System.out.println("Enter a valid no");
            }
        }
    }
}
