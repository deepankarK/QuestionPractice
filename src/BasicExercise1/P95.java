package BasicExercise1;

import java.util.Scanner;

//Write a Java program to compute the square root of a given integer.
public class P95 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number: ");
        int num = sc.nextInt();
        System.out.println("Square of root of " + num + " is: " + (Math.sqrt(num)));
    }
}
