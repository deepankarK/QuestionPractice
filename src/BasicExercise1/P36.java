package BasicExercise1;

import java.util.Scanner;

//Write a Java program that accepts three integers from the user and return
// true if two or more of them (integers ) have the same rightmost digit.
// The integers are non-negative.
public class P36 {

    public static boolean check(int x, int y, int z) {
        return ((x % 10 == y % 10) || (y % 10 == z % 10) || (x % 10 == z % 10));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int a = sc.nextInt();
        System.out.print("Input the second number: ");
        int b = sc.nextInt();
        System.out.print("Input the third number: ");
        int c = sc.nextInt();

        System.out.println("The result is: " + check(a,b,c));
    }
}
