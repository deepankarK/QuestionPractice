package BasicExercise1;

import java.util.Scanner;

//Write a Java program that takes three numbers
// as input to calculate and print the average of the numbers
public class P12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[3], sum = 0;
        double average;

        for (int i = 0; i< 3; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        average = sum/3;
        System.out.println(average);
    }
}
