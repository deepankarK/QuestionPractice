package BasicExercise1;

import java.util.Scanner;

//Write a Java program to print the sum of two numbers.
public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[]= new int[2];
        int sum = 0;
        for(int i = 0; i < 2; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }

        System.out.println(sum);
    }
}
