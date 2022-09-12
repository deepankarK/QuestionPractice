package BasicExercise1;


public class P32 {

    public static boolean divideBy3(int num) {
        return (num % 3 == 0);
    }

    public static boolean divideBy5(int num) {
        return (num % 5 == 0);
    }

    public static void main(String[] args) {
        System.out.println("Divide by 3: ");
        for (int i = 1; i < 100; i++) {
            if(divideBy3(i)) {
                System.out.print(i + ",");
            }
        }
        System.out.println('\n');

        System.out.println("Divide by 5: ");
        for (int i = 1; i < 100; i++) {
            if(divideBy5(i)) {
                System.out.print(i + ",");
            }
        }
        System.out.println('\n');

        System.out.println("Divide by 3 & 5: ");
        for (int i = 1; i < 100; i++) {
            if(divideBy3(i) && divideBy5(i)) {
                System.out.print(i + ",");
            }
        }


    }
}
