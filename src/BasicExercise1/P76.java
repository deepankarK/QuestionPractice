package BasicExercise1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Write a Java program than read an integer and calculate the sum of its digits
// and write the number of each digit of the sum in English.
public class P76 {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int sum = 0;
            String str = br.readLine();
            char[] ch = str.toCharArray();
            for(int i = 0; i < ch.length; i++) {
                sum += ch[i] - '0';
            }
            System.out.println("Original Number: " + str);
            System.out.println("Sum in Numerics: " + sum);
            printNumber(sum);
            br.close();

        }catch (IOException e){System.out.println(e);}
    }

    public static void printNumber(int sum){
        int x, y , z;
        String[] number ={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        System.out.print("Sum of the digits in English: ");
        if(sum < 10)
            System.out.println(number[sum]);
        else if (sum < 100) {
            x = sum / 10;
            y = sum - x * 10;
            System.out.println(number[x] + " " + number[y]);
        }else{
            x = sum / 100;
            y = (sum - x * 100) / 10;
            z = sum - x * 100 - y * 10;
            System.out.println(number[x] + " " + number[y] + " " + number[z]);
        }
    }
}
