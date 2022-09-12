package BasicExercise1;

import java.util.Scanner;

// Write a Java program to convert seconds to hour, minute and seconds.
public class P37 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Seconds:");
        int seconds = sc.nextInt();
        int ss = seconds % 60;
        System.out.println(ss);
        int hh = seconds / 60;
        System.out.println(hh);
        int mm = hh % 60;
        System.out.println(mm);
        hh = hh / 60;
        System.out.println(hh);
        System.out.println(hh + ":" + mm + ":" + ss);

    }
}
