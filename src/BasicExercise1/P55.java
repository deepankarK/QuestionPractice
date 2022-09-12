package BasicExercise1;

import java.util.Scanner;

public class P55 {

    static boolean check(int a, int b, int c) {
        return ((Math.abs(a - b) >= 20 || Math.abs(b -c) >= 20 || Math.abs(c - a) >= 20));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input the first number: ");
        int a = sc.nextInt();
        System.out.println("Input the second number: ");
        int b = sc.nextInt();
        System.out.println("Input the third number: ");
        int c = sc.nextInt();

        System.out.println(check(a, b, c));
    }
}
