import java.util.Scanner;

public class Q47_48Circlr {
    private double radius;

    private Q47_48Circlr() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Radius in cm");
        this.radius = sc.nextDouble();
    }

    public static void main(String[] args) {
        Q47_48Circlr obj = new Q47_48Circlr();
        obj.circleArea(obj.radius);
        obj.circlePerimeter(obj.radius);
    }

    private void circleArea(double radius) {
        double area = radius * radius * (22d / 7d);
        System.out.println("Area :" + area + "sqcm");
    }

    private void circlePerimeter(double radius) {
        double perimeter = radius * 2d * (22d / 7d);
        System.out.println("Perimeter :" + perimeter + "cm");
    }
}
