package BasicExercise1;

public class P91 {

    public static void main(String[] args) {
        int n = 7;
        int factorial = 1;

        for(int i = 1; i <=n; i++){
            factorial *= i;
        }
        long ctr = 0;
        while (n != 0)
        {
            ctr += n / 5;
            n /= 5;
        }
        System.out.println(factorial);
        System.out.println(ctr);
    }
}
