package BasicExercise1;

import java.util.Scanner;

//Write a Java program to check if an array of integers contains a specified number next to
// each other or there are two same specified numbers separated by one element.
public class P83 {

    public static boolean check (int[] arr, int specifiedNum){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == specifiedNum || arr[i+2] == specifiedNum)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: " );
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();;
        }

        System.out.println("Enter the int to search: ");
        int specifiedNum = sc.nextInt();;

        System.out.println(check(arr, specifiedNum));
    }
}
