import java.util.Scanner;

public class Q37_44_Employee {
    public static void main(String[] args) {
        //Q36-37
        new Employee();

        Q37_44_Employee obj = new Q37_44_Employee();
        obj.employee_test();
    }

    void employee_test() {
        Employee e1 = new Employee(), e2 = new Employee();
        System.out.println("salary one");
        System.out.println(e1.salary);
        System.out.println("salary two");
        System.out.println(e2.salary);

    }


}

class Employee {
    String firstname, lastname;
    double salary;

    Employee() {
        this.get();

        System.out.println(firstname + lastname + salary);

    }

    void get() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first name");
        this.firstname = sc.nextLine();
        System.out.println("Enter the last name");
        this.lastname = sc.nextLine();
        System.out.println("Enter the Salary");
        this.salary = sc.nextDouble();
    }
}