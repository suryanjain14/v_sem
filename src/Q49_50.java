import java.util.Scanner;

public class Q49_50 {
    public static void main(String[] args) {
        //ContractEmployee ce1=new ContractEmployee();
        RegularEmployee re1 = new RegularEmployee();
        re1.displayFullName();
        System.out.println(re1.salary + "$");
    }
}

//cannot create class named employee as it is already present Q37_40
class Employees {
    String firstname, lastname;
    double salary;
    Scanner sc = new Scanner(System.in);

    Employees() {
        getFirstName();
        getLastName();
    }

    void getFirstName() {
        System.out.println("Enter the first name");
        firstname = sc.nextLine();
    }

    void getLastName() {
        System.out.println("Enter the last name");
        lastname = sc.nextLine();
    }
}

class ContractEmployee extends Employees {
    String department, designation;
    Scanner sc = new Scanner(System.in);

    ContractEmployee() {
        getDepartment();
        getDesig();
    }

    void displayFullName() {
        System.out.println("Name :" + super.firstname + " " + super.lastname);
    }

    void getDepartment() {
        System.out.println("Enter the department");
        department = sc.nextLine();
    }

    void getDesig() {
        System.out.println("Enter the designation");
        designation = sc.nextLine();
    }

}

class RegularEmployee extends Employees {
    String department, designation;
    Scanner sc = new Scanner(System.in);

    RegularEmployee() {
        getDepartment();
        getDesig();
        getSalary();
    }

    void displayFullName() {
        System.out.println("Name" + super.firstname + " " + super.lastname);
    }

    void getDepartment() {
        System.out.println("Enter the department");
        department = sc.nextLine();
    }

    void getDesig() {
        System.out.println("Enter the designation");
        designation = sc.nextLine();
    }

    void getSalary() {
        System.out.println("Enter the salary of regular Employee");
        super.salary = sc.nextDouble();
    }
}


class HorlyEmployee extends ContractEmployee {
    double noOfHrs;
    double wagePerHrs;

    void CalculateWages() {
        double salary = noOfHrs * wagePerHrs;
    }

    void getDesig() {
        super.designation = "Hourly contract";
    }


}

class WeeklyEmployee extends ContractEmployee {
    double noOfweeks;
    double wagePerweek;

    void CalculateWages() {
        double salary = noOfweeks * wagePerweek;
    }

    void getDesig() {
        super.designation = "weekly contract";
    }
}