package BasicExercise1;

import java.util.Scanner;

public class P84 {

    public static int check(int[] arr){
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 20 && arr[i++] != 20)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: " );
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();;
        }
        if (check(arr) == 3){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }

}
