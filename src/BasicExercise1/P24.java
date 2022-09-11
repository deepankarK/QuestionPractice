package BasicExercise1;

//Write a Java program to reverse a string. Go to the editor
//Input Data:
//Input a string: The quick brown fox
public class P24 {
    public static void main(String[] args) {

        String str = "The object brown fox";
        char[] letters = str.toCharArray();
        System.out.println("Reverse string is: ");
        for (int i = letters.length -1; i >= 0; i--) {
            System.out.print(letters[i]);
        }
    }
}
