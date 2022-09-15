package BasicExercise1;

//Write a Java program which iterates the integers from 1 to 100. For multiples of three print "Fizz" instead of the number and print "Buzz" for the multiples of five. When number
// is divided by both three and five, print "fizz buzz".
public class P94 {

    public static String checkNumber(int num){
        if(num % 3 == 0){
            return "Fizz";
        }else if(num % 5 == 0){
            return "Buzz";
        }else {
            return (num % 3 == 0 && num % 5 == 0 ? "fizzbuzz" : "nothing");
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++ ){
            System.out.println(i + " : "+ checkNumber(i));
        }
    }

}
