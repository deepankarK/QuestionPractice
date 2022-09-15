package BasicExercise1;

import java.util.Arrays;
import java.util.Scanner;

//Write a Java program to create a new array that is left shifted from a given array of integers.
public class P87 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        int[] new_array = new int[n];

        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
            int first = array[0];

            for(int j = 0; j < array.length - 1; j++){
                new_array[j] = array[j+1];
            }
            new_array[i] = first;
        }

        System.out.println(Arrays.toString(new_array));

    }
}
