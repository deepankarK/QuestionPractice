package BasicExercise1;

import java.util.Scanner;

//Write a Java program to create the concatenation of the two strings except removing the first
// character of each string. The length of the strings must be 1 and above
public class P62 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String str = sc.nextLine();
        System.out.println("Enter second string: ");
        String Str2 = sc.nextLine();

        if(str.length() >= 1 && Str2.length() >= 1)
            System.out.println(str.substring(1) + Str2.substring(1));
        else {
            System.out.println("Length of strings must be 1 or above");
        }
    }
}
