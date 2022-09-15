package BasicExercise1;

import java.util.Scanner;

//Write a Java program to add all the digits of a given
// positive integer until the result has a single digit.
public class P88 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integers: ");
        int n = sc.nextInt();
        int sum = 0;
        while (n != 0 && sum < 10) {
            int temp = n % 10;
            sum += temp;
            n /= 10;
        }
        System.out.println(sum < 10 ? sum : "Digit is more than 1");
    }
}
