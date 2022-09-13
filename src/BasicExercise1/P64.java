package BasicExercise1;

import java.util.Scanner;

//Write a Java program to create a new string taking first and last characters from two given strings. If the length of either string is 0 use "#" for missing character.
public class P64 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        if(str1 == null){
            System.out.println("#" + str2.charAt(-1));
        }else if(str2 == null){
            System.out.println(str1.charAt(0) + "#");
        }
        else{
            System.out.println(str1.substring(0, 0) + str2.substring(-1, -1));
        }
    }
}
