package BasicExercise1;

import java.util.Scanner;

//Write a Java program start with an integer n, divide n by 2
// if n is even or multiply by 3 and add 1 if n is odd, repeat
// the process until n = 1.
public class P75 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter integer: ");
        int n = sc.nextInt();

        while (n != 1){
            if(n % 2 == 0){
                n/= 2;
            }else {
                n += 1;
            }
        }
        System.out.println(n);

    }
}
