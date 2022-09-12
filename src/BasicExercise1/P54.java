package BasicExercise1;

import java.util.Scanner;
//Write a Java program to reverse a word.
public class P54 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        String result = "";

        char[] c = str.toCharArray();
        for(int i = c.length - 1; i >= 0; i--) {
            result += c[i];
        }
        System.out.println("Reversed word: " + result.trim());
    }
}
