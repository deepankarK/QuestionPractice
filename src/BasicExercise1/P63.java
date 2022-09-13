package BasicExercise1;

import java.util.Scanner;

//Write a Java program to create a new string taking first three characters
// from a given string. If the length of the given string is less than 3 use "#" as substitute characters.
public class P63 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input String: ");
        String str = sc.nextLine();

        if(str.length() == 1){
            System.out.println(str.charAt(0) + "##");
        }else if (str.length() < 1){
            System.out.println("###");

        } else if (str.length() == 2) {
            System.out.println(str.substring(0, 2) + "#");
        } else {
            System.out.println(str.substring(0, 3));
        }
    }
}
