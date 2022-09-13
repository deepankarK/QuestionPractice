package BasicExercise1;

import java.util.Scanner;

//Write a Java program to compute the sum of the first 100 prime numbers.
public class P59 {

    static boolean check(int a) {
        for (int i = 2; i <= 100; i++) {
            if (a % i == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int sum = 0;
        for(int i = 2; i <= 100; i++){
            if(check(i)){
                sum += i;
            }
        }

        System.out.println(sum);
    }
}
