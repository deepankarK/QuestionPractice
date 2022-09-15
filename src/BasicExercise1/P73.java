package BasicExercise1;

import java.util.Scanner;

//Write a Java program to take the last three characters from a given string and add the three characters at both the front and back of the string. String length must be greater than three and more.
public class P73 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input string: ");
        String str = sc.nextLine();;
        System.out.println(str.substring(str.length()-3) + str + str.substring(str.length()-3));
    }
}
