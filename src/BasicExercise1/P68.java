package BasicExercise1;

import java.util.Arrays;

//Write a Java program to create a new array of length 2 from
// two arrays of integers with three elements and the new array will contain the first and last elements from the two arrays.
public class P68 {

    public static void main(String[] args) {
        int array1[] = {50, -20, 0};
        int array2[] = {5, -50, 10};
        int array3[] = new int[2];


        for (int i = 0 ; i < 2; i++) {
            System.out.print(array3[i] + ",");
        }
    }
}
