package BasicExercise1;

import java.util.Scanner;

//Write a Java program to extract the first half of a string of even length.
public class P60 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        char[] ch = str.toCharArray();
        int size = ch.length;

        for(int i = 0; i < size / 2; i ++){
            System.out.print(ch[i]);
        }
    }
}
