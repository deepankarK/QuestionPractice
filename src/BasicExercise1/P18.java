package BasicExercise1;

import java.util.Scanner;

// Write a Java program to convert a decimal number to binary number
public class P18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int remainder[] = new int[100];
        int num = sc.nextInt(), i = 1, quot = num;


        while (quot != 0) {
            remainder[i++]= quot % 16;
            quot /= 16;
        }

        for(int j = i -1; j > 0; j--)
            if(remainder[j] == 10) {
                System.out.println("A");
            }else if (remainder[j] == 11) {
                System.out.println("B");
            }else if (remainder[j] == 12) {
                System.out.println("C");
            }else if (remainder[j] == 13) {
                System.out.println("D");
            }else if (remainder[j] == 14) {
                System.out.println("E");
            } else {
                System.out.print("Hexadecimal: " + remainder[j]);
            }
        }
    }

