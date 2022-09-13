package BasicExercise1;

import java.util.Scanner;

//Write a Java program to calculate the modules of two numbers without using any inbuilt modulus operator.
public class P58 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        int divided = a / b;
        int result = a - (divided * b);
        System.out.println(result);

    }
}
