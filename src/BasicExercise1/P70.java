package BasicExercise1;

//Write a Java program to rotate an array (length 3) of integers in left direction.

import java.util.Arrays;

public class P70 {
    public static void main(String[] args) {
        int[] originalArray = {20, 30, 40};
        int[] rotatedArray = {originalArray[1], originalArray[2], originalArray[0]};

        System.out.println("Original array: " + Arrays.toString(originalArray));
        System.out.println("Rotated array: " + Arrays.toString(rotatedArray));
    }
}
