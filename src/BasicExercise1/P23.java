package BasicExercise1;

//Write a Java program to compute
// the distance between two points on the surface of earth.
//Distance between the two points [ (x1,y1) & (x2,y2)]
//d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
//Radius of the earth r = 6371.01 Kilometers

import java.util.Scanner;

public class P23 {
    final double radius = 6371.01;

    public static double calculate(double x1, double x2, double y1, double y2) {
        P23 obj = new P23();
        double distance = obj.radius * Math.acos(Math.sin(x1) * Math.sin(x2) *
                Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
         return distance;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the latitude of coordinate x1: ");
        double x1 = sc.nextDouble();
        System.out.println("Input the longitude of coordinate y1: ");
        double y1 = sc.nextDouble();
        System.out.println("Input the latitude of coordinate x2: ");
        double x2 = sc.nextDouble();
        System.out.println("Input the longitude of coordinate y2: ");
        double y2 = sc.nextDouble();

        System.out.println("The distance between those points is: " +
                calculate(x1, x2, y1, y2));



    }
}
