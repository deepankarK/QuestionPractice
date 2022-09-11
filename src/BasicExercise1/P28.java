package BasicExercise1;

//Write a Java program to print the ascii value of a given
// character.
//Expected Output
//The ASCII value of Z is :90
import java.util.Scanner;
public class P28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character: ");
        char ascii = sc.next().charAt(0);
        int asc = ascii;
        System.out.println("The ASCII value of " + ascii + "is: "
        + asc);
    }
}
