package BasicExercise1;

//Write a Java program to find the largest element between first, last, and middle values from an array of integers (even length).
public class P71 {

    public static void main(String[] args) {
        int[] original_array = {20, 30, 40, 50, 67};
        int largest, size = original_array.length;
        if(original_array[0] > original_array[size -1]){
            if (original_array[0]> original_array[size/2]){
                largest = original_array[0];
            }else{
                largest = original_array[size/2];
            }
        }else{
            if(original_array[size-1] > original_array[size/2]){
                largest = original_array[size-1];
            }else {
                largest = original_array[size/2];
            }
        }

        System.out.println(largest);
    }
}
