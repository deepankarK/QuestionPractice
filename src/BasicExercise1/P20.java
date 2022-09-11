package BasicExercise1;

import java.util.Scanner;

//Write a Java program and
// compute the sum of the digits of an integer.
public class P20{

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt(), sum = 0;

                while (a != 0) {
                        int temp = a % 10;
                        sum += temp;
                        a/= 10;
                }

                System.out.println(sum);
        }
}
