package BasicExercise1;

import java.util.Scanner;

//Write a Java program to print
// the area and perimeter of a rectangle
public class P13 {

    public double area(double width, double height) {
        double area = width * height;
        return area;
    }

    public double perimeter(double width, double height) {
        double perimeter = 2*(width + height);
        return perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        P13 obj = new P13();
        double width = sc.nextDouble(), height = sc.nextDouble();

        System.out.println("Perimeter: " + obj.perimeter(width, height));
        System.out.println("Area: " + obj.area(width, height));
    }
}
