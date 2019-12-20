import java.util.Scanner;

public class Q37_40_Employee {
    private Employee e1 = new Employee(), e2 = new Employee();

    public static void main(String[] args) {
        //Q37-38
        new Employee();
//Q39
        Q37_40_Employee obj = new Q37_40_Employee();
        obj.employee_test();
        //Q40
        obj.raise();
    }

    private void employee_test() {
        System.out.println("salary one");
        System.out.println(e1.salary);
        System.out.println("salary two");
        System.out.println(e2.salary);
    }

    private void raise() {
        System.out.println("Raise");
        e1.salary = e1.salary + e1.salary * .10d;
        e2.salary = e2.salary + e2.salary * .10d;
        System.out.println(e1.salary);
        System.out.println(e2.salary);

    }


}

class Employee {
    private String firstname, lastname;
    double salary;

    Employee() {
        this.get();

        System.out.println(firstname + lastname + salary);

    }

    private void get() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first name");
        this.firstname = sc.nextLine();
        System.out.println("Enter the last name");
        this.lastname = sc.nextLine();
        System.out.println("Enter the Salary");
        this.salary = sc.nextDouble();
    }
}