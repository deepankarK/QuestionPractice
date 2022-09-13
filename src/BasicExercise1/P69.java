package BasicExercise1;

import java.util.Scanner;
//Write a Java program to test that a given array of integers of length 2 contains a 4 or a 7
public class P69 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[2];
        System.out.println("Enter array data: ");
        for(int i = 0; i < 2; i++) {
            array[i] = sc.nextInt();
        }
        if(array[0] == 4 || array[0] == 7)
            System.out.println("True");
        else
            System.out.println(array[1] == 4 || array[1] == 7);
    }
}
