package BasicExercise1;

import java.util.Scanner;

//Write a Java program to find the number of values in a given range divisible by a given value
//For example x = 5, y=20 and p =3, find the number of integers within the range x..y and
// that are divisible by p i.e. { i :x ≤ i ≤ y, i mod p = 0 }
public class P50 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.print("Enter the starting point of the range: ");
        int a = sc.nextInt();

        System.out.print("Enter the end range: ");
        int b = sc.nextInt();

        System.out.print("Enter the number to be divided by: ");
        int c = sc.nextInt();

        for (int i = a; i < b; i++){
            if(i % c == 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
