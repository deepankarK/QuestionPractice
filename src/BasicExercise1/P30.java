package BasicExercise1;

//Write a Java program to print
//the odd numbers from 1 to 99. Prints one number per line.
public class P30 {

    public static boolean oddEven(int number){
        return (number % 2 == 0);
    }

    public static void main(String[] args) {

        for (int i = 1; i < 100; i++){
            if(!oddEven(i)){
                System.out.println(i);
            }
        }
    }
}
