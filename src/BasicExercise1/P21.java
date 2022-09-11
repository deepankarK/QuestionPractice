package BasicExercise1;

import java.util.Scanner;

//Write a Java program to compute the area of a hexagon.
public class P21 {
    public static double area(int lengthSides, int numberSides) {
        double area = (numberSides * (Math.pow(lengthSides, 2))/ (4 * (Math.tan(Math.PI/numberSides)) ));
        return area;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number of sides on the polygon: ");
        int numberOfSides = sc.nextInt();
        System.out.println("Input the length of one of the sides: ");
        int lengthSides = sc.nextInt();
        System.out.println("The area is: " + area(lengthSides, numberOfSides));
    }
}
