package BasicExercise1;

import java.util.Scanner;

//Write a Java program to print the sum (addition), multiply,
//subtract, divide and remainder of two numbers.
public class P5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println((int)a/b);
        System.out.println(a%b);
    }
}
