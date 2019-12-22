import java.util.Scanner;
import java.util.SortedMap;

public class Q54_55_56_58Shape {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.getArea();
    }
}

abstract class Shape {
    String name;
    Scanner sc = new Scanner(System.in);

    Shape() {
        getName();
    }

    void getName() {
        System.out.println("Enter the name of Shape");
        name = sc.nextLine();
    }

}

abstract class TwoDim extends Shape {
    double length, breadth, area;

    TwoDim() {
        super();
        getBreadth();
        getLength();
    }

    void area() {
        System.out.println("Area of " + name + " is" + area);
    }

    void getBreadth() {
        System.out.println("Breadth");
        breadth = sc.nextDouble();
    }

    void getLength() {
        System.out.println("length");
        length = sc.nextDouble();
    }
}

abstract class ThreeDim extends Shape {
    double length, breadth, height, volume;

    ThreeDim() {
        super();
        getBreadth();
        getHeight();
        getLength();
    }

    void volume() {
        System.out.println("Volume of " + name + " is" + volume);
    }

    void getBreadth() {
        System.out.println("breadth");
        breadth = sc.nextDouble();
    }

    void getHeight() {
        System.out.println("height");
        height = sc.nextDouble();
    }

    void getLength() {
        System.out.println("length");
        length = sc.nextDouble();
    }
}


class Rectangle extends TwoDim {
    Rectangle() {
        super();
    }

    void getArea() {
        super.area = super.breadth * super.breadth;
        super.area();
    }

}
//same will be done for rest