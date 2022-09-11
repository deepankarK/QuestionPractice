package BasicExercise1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class P31 {
    public static boolean oddEven(int number){
        return (number % 2 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = sc.nextInt();

        System.out.println(oddEven(num) ? "1" : "0");
//        if(oddEven(num))
//            System.out.println("1");
//        else
//            System.out.println("0");
    }
}
