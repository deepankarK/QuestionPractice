package BasicExercise1;

import java.util.Scanner;

//Write a Java program to test if the first or the last element of two array of integers are same.
public class P67 {

    static boolean check(int arr1[], int arr2[]){
        return (arr1[0] == arr1[arr1.length-1] || arr2[0] == arr2[arr2.length-1] ||
        arr1[0] == arr2[0] || arr1[0] == arr2[arr2.length-1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array1[] = {50, -20, 0, 30, 40, 60, 12};
        int array2[] = {45, 20, 10, 20, 30, 50, 11};

        System.out.println(check(array1, array2));
    }
}
