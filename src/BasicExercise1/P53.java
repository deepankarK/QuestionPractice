package BasicExercise1;

import java.util.Scanner;

//Write a Java program to capitalize the first letter
// of each word in a sentence
public class P53 {
    public static void main(String[] args) {
        String str = "the quick brown for jumps over the lazy dog.";
        String upper_case_line = "";
        Scanner lineScan = new Scanner(str);
        while(lineScan.hasNext()) {
            String word = lineScan.next();
            upper_case_line += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
        }
        System.out.println(upper_case_line.trim());
    }
}
