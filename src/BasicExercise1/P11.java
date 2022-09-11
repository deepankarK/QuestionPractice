package BasicExercise1;

import java.util.Scanner;

// Write a Java program to print the area and
// perimeter of a circle.
public class P11 {
    static double perimeter(double radius) {
        double c = 2*Math.PI*radius;
        return c;
    }

    static double area(double radius) {
        double area = Math.PI*(Math.pow(radius, 2));
        return area;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius;
        radius = sc.nextDouble();

        System.out.println("Perimeter = " + perimeter(radius));
        System.out.println("Area = " + area(radius));
    }
}
