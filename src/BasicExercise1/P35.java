package BasicExercise1;

import java.util.Scanner;
//Write a Java program to calculate the sum of two integers
// and return true if the sum is equal to a third integer.
public class P35 {
    public static boolean test(int x, int y, int z){
        return x + y == z;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int a = sc.nextInt();
        System.out.print("Input the second number: ");
        int b = sc.nextInt();
        System.out.print("Input the third number: ");
        int c = sc.nextInt();

        System.out.println("The result is: " + test(a,b,c));


    }
}
