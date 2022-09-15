package BasicExercise1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//Write a Java program to rearrange all the elements of a given array of integers so that all the
// odd numbers come before all the even numbers.
public class P80 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int[] array_nums = {1, 7, 8, 5, 7, 13, 0, 2, 4, 9};
        System.out.println("Original Array: "+Arrays.toString(array_nums));
        while(i < array_nums.length && array_nums[i] % 2 == 0)
            i++;

        for(int j = i + 1; j < array_nums.length; j++) {
            if(array_nums[j] % 2 != 0) {
                int temp = array_nums[i];
                array_nums[i] = array_nums[j];
                array_nums[j] = temp;
                i++;
            }
        }

        System.out.println("New Array: "+Arrays.toString(array_nums));

    }
}
