package BasicExercise1;

import java.util.Scanner;

//Write a Java program to find the penultimate (next to last) word of a sentence.
public class P52 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        String[] str1 = str.split("[ ]+");
        System.out.println("Penultimate: " + str1[str1.length - 2]);
    }
}
