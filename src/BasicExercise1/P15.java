package BasicExercise1;

//Write a Java program to swap two variables.
public class P15 {

    public static void main(String[] args) {
        int a = 25, b = 5;

        System.out.println(a);
        System.out.println(b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }
}
