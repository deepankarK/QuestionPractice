package BasicExercise1;

import java.util.Scanner;

//Write a Java program to create a string in the form short_string + long_string + short_string from two strings. The strings must not have the same length.
public class P61 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.println("Enter second string: ");
        String str2 = sc.nextLine();

        if(str1.length() < str2.length()){
            System.out.println(str1 + str2 + str1);
        }else if (str2.length() < str1.length()) {
            System.out.println(str2 + str1 + str2);
        }else {
            System.out.println("String can not be of same length.");
        }
    }
}
