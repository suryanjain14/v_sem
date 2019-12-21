import java.util.Scanner;

public class Q51_52Vehicle {
    public static void main(String[] args) {

    }
}
class Vehicle {
    String insuranceno, vehicleno, color;

    void getConsumption() {
    }

    void displayConsuption() {
    }
}

class TwoWheeler extends Vehicle {
    String type, companey;
    Scanner sc = new Scanner(System.in);

    void maintainance() {
    }

    void average() {
    }

    void getType() {
        type = sc.nextLine();

    }

    void getCompaney() {
        companey = sc.nextLine();
    }

}

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