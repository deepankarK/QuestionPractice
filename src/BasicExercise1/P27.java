package BasicExercise1;

import java.nio.charset.Charset;

//Write a Java program to list the available character sets in
// charset objects.
//Expected Output
//List of available character sets:
//Big5
//Big5-HKSCS
//CESU-8
//EUC-JP
//EUC-KR
//GB18030
//GB2312
//GBK
public class P27 {

    public static void main(String[] args) {
        System.out.println("List of available character sets: ");
        //count is my personal addition to the program
        int count = 0;
        for (String str : Charset.availableCharsets().keySet()) {
            System.out.println(str);
            count++;
        }
        System.out.println(count);
    }
}
