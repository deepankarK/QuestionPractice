package BasicExercise1;

//Write a Java program that accepts
// two integer values between 25 to 75 and return true if there is a common digit in both numbers.

import java.util.Scanner;

public class P57 {

    static boolean check(int a, int b) {
        int flag = 0;
        while (a != 0 && b != 0){
            int temp1 = a % 10;
            int temp2 = b % 10;

            if( temp1 == temp2) {
                flag = 1;
            }
            a /= 10;
            b /= 10;
        }
        return (flag != 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first integer between 25 to 75: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second integer between 25 to 75: ");
        int num2 = sc.nextInt();

        if (num1 > 25 && num1 < 75 && num2 > 25 && num2 < 75)
            System.out.println(check(num1, num2));
        else {
            System.out.println("Invalid Input.");
        }
    }
}