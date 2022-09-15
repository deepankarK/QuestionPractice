package BasicExercise1;

import java.util.Scanner;
//Write a Java program to count the number of even and odd elements in a given array of integers.
public class P78 {

    public static boolean check(int num){
        return ( num % 2 == 0);
    }

    public static void main(String[] args) {

        int[] array = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++){
            array[i] = sc.nextInt();
        }
        for(int i = 0; i< 5; i++){
            if(check(array[i]))
                System.out.println("Even numbers are: " + array[i]);
            else{
                System.out.println("Odd numbers are: " + array[i]);
            }
        }
        sc.close();
    }

}
