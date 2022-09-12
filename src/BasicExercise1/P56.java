package BasicExercise1;

import java.util.Scanner;

public class P56 {

    public static int check(int a, int b) {
        if(a == b){
            return 0;
        }else {
            if(a % 6 == b % 6) {
                return (Math.min(a, b));
            }
        }
        return Math.max(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the first number: ");
        int a = sc.nextInt();
        System.out.println("Input the second number: ");
        int b = sc.nextInt();

        System.out.println("Result: " + check(a, b));


    }
}
