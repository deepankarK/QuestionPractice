package BasicExercise1;

import com.sun.tools.javac.Main;

import java.io.Console;

// Write a Java program to input and display your password.
//Expected Output
//
//Input your Password:
//Your password was: abc@123
public class P29 {

    public static void main(String[] args) {
        Console cons = System.console();
        if (cons == null) {
            System.out.println(
                    "No console available");
            return;
        }
        System.out.println("Password: ");
        char[] password = cons.readPassword();
        System.out.println(password);
    }
}
