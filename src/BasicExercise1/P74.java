package BasicExercise1;

import java.util.Scanner;
//Write a Java program to check if a string starts with a specified word.
public class P74 {

    static boolean check (String str, String word){
        return (str.startsWith(word));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input string: ");
        String str = sc.nextLine();
        System.out.print("Enter word to be checked: ");
        String word = sc.nextLine();
        System.out.println(check(str.toUpperCase(), word.toUpperCase()));

    }
}
