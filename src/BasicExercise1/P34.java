package BasicExercise1;

import java.util.Scanner;

public class P34 {

    public static boolean test(int x, int y, int z, boolean xyz) {
        if(xyz)
            return z > y;
        return y > x && z > y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int a = sc.nextInt();
        System.out.print("Input the second number: ");
        int b = sc.nextInt();
        System.out.print("Input the third number: ");
        int c = sc.nextInt();

        System.out.println("The result is: " + test(a, b, c, true));
    }
}
