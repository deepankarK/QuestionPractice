package BasicExercise1;

//Write a Java program to test if 10 appears as either the first or last element of an array of integers.
public class P65 {

    static boolean check (int arr[]){
        int size = arr.length;
        if(arr[0] == 10 || arr[size-1] == 10){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        int array[] = {10, -20, 0, 30, 40, 60 , 9};

        System.out.println(check(array));
    }
}
