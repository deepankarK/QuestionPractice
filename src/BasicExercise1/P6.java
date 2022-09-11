package BasicExercise1;

import java.util.Scanner;

//Write a Java program that takes a number as input
// and prints its multiplication table upto 10
public class P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for(int i = 1; i < 11; i++) {
            System.out.println(a + " x " + i + " = " + a*i);
        }
    }
}
