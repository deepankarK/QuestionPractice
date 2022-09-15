package BasicExercise1;

import java.util.Arrays;
import java.util.Scanner;
//Write a Java program to create an array (length # 0) of string values. The elements will contain "0", "1", "2" … through ... n-1.
public class P82 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int n = sc.nextInt();
        if(n <= 0){
            System.out.println("Array length can not be zero or below size. " +
                    "Enter again: ");
            n = sc.nextInt();
        }
        String[] str = new String[n];
        for (int i = 0; i < n; i++){
            str[i] = String.valueOf(i);

        }
        System.out.println(Arrays.toString(str));
    }
}
