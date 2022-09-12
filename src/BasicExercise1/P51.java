package BasicExercise1;

import java.util.Scanner;

//Write a Java program to accepts an integer and count the factors of the number.
public class P51 {

    static int countFactors(int num) {
        int count = 0;
        for (int i = 1; i < num; i++ ){
            if(num % i ==0 && i * i != num) {
                count += 2;
            }else {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("Number of factors are: " + countFactors(num));
    }

}
