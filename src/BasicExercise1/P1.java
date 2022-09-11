package BasicExercise1;

//Write a Java program to print 'Hello' on screen
// and then print your name on a separate line.

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        String all = "Hello" + '\n' + name;

        System.out.println(all);
    }
}
