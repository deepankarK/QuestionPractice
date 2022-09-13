package BasicExercise1;

//Write a Java program to test if the first and the last element of an array of integers are same.
public class P66 {

    static boolean check(int arr[]){
        int size = arr.length;
        return (arr[0] == arr[size-1]);
    }

    public static void main(String[] args) {
        int array[] = {10, -20, 0, 30, 40, 60, 10};
        System.out.println(check(array));
    }
}
