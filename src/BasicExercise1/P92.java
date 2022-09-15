package BasicExercise1;

import java.util.Scanner;

//Write a Java program to check if a positive number is a palindrome or not.
public class P92 {

    public static boolean check(int num){
        int backupValue = num;
        int reverse = 0;
        while (num > 0) {
            int temp = num % 10;
            reverse = reverse * 10 + temp;
            num /= 10;
        }
        return (backupValue == reverse);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = sc.nextInt();
        sc.close();
        System.out.println(check(num));
    }

}
