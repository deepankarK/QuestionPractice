package BasicExercise1;

import java.util.Scanner;

//Write a Java program to compute the area of a polygon.
public class P22 {
    public static double area(int numberOfSides, int lengthOfSides){
        double area = (numberOfSides * (Math.pow(lengthOfSides, 2))) / (4 * Math.tan(Math.PI/numberOfSides));
        return area;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of sides on the polygon: ");
        int numberOfSides = sc.nextInt();
        System.out.print("Input the length of sides: ");
        int lengthOfSides = sc.nextInt();

        System.out.println("The area is: " + area(numberOfSides, lengthOfSides));
    }
}
