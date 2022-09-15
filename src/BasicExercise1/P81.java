package BasicExercise1;

import java.util.Scanner;

//Write a Java program to check if
// there is a 10 in a given array of integers with a 20 somewhere later in the array.
public class P81 {

    public static boolean check(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == 10 && arr[i++] == 20 ) {
                index = i;
                for(int j = index; j < arr.length; j++){
                    if(arr[j] == 20)
                        return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(check(arr));
    }

}
