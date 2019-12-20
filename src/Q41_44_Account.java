import java.util.Scanner;

public class Q41_44_Account {
    public static void main(String[] args) {
        AccountTest at = new AccountTest();
        at.psvm();
    }
}

class Account {
    private double balance;

    Account() {
        Scanner sc = new Scanner(System.in);
        if (balance < 0.0) {
            System.out.println("Enter Balance");
            sc.nextDouble();
        }
    }

    void credit(double balance) {
        this.balance = balance + this.balance;
    }

    void getBalance() {
        System.out.println("THe balance is :" + this.balance);
    }

    void debit(double balance) {
        if (balance < this.balance) {
            this.balance = this.balance - balance;
        } else {
            System.out.println("Low Balance");
        }
    }
}

class AccountTest {
    private Account ac = new Account();

    void psvm() {
        ac.credit(45);
        ac.credit(5);
        ac.getBalance();
        ac.debit(15);
        ac.getBalance();
        ac.debit(45);
    }
}

