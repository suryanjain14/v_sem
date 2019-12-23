import java.util.Scanner;

public interface Q60Payable {
    void getAmount();
}

class Employeei implements Q60Payable {
    int amount;

    public void getAmount() {
        Scanner sc = new Scanner(System.in);
        amount = sc.nextInt();
    }
}

