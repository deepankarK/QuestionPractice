package BasicExercise1;

import java.util.Scanner;

//Write a Java program to test if an array of integers contains an element 10 next to 10 or an element 20 next to 20, but not both.
public class P79 {

    public static boolean check(int[] arr){
        boolean found10 = false;
        boolean found20 = false;
        for(int i = 0; i < 5; i++){
            if(arr[i] == 10 && arr[i+1] == 10)
                found10 = true;

            if(arr[i] == 20 && arr[i+1] == 20)
                found20 = true;
        }
        return found10!=found20;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        for (int i = 0; i < 5; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(check(arr));


    }
}
