import java.util.Scanner;
//Q61 is also implemented
//Q61 is also implemented
//Q61 is also implemented
public class Q51_52Vehicle {
    public static void main(String[] args) {

    }
}

class Vehicle {
    String insuranceno, vehicleno, color;
    int consumption;

    public void getConsumption() {
        //public coz a same method is defined in interface Q61Vehicle
        consumption = 0;
    }

    void displayConsumption() {
        System.out.println("Consumption is " + consumption);
    }
}

class TwoWheeler extends Vehicle implements Q61Vehicle {
    String type, company;
    Scanner sc = new Scanner(System.in);

    void maintainance() {
    }

    void average() {
    }

    void getType() {
        System.out.println("Enter the type");
        type = sc.nextLine();

    }

    void getCompany() {
        System.out.println("Enter the company");
        company = sc.nextLine();
    }

    public void getColor() {
        System.out.println("Enter the color ");
        super.color = sc.nextLine();
    }

    public void getNumber() {
        System.out.println("Enter the vehicle No ");
        super.vehicleno = sc.nextLine();
    }

}

//same will be implemented for FourWheelers
class FourWheeler extends Vehicle {
    void maintainance() {
    }

    void average() {
    }

}

class Geared extends TwoWheeler {

    void average() {
    }
}

class NONGeared extends TwoWheeler {

    void average() {
    }
}