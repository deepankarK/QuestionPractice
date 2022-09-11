package BasicExercise1;

//Write a Java program to divide
//two numbers and print on the screen.

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b= sc.nextInt();
        double c = a/b;
        System.out.println(c);
    }
}
