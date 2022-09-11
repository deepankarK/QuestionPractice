package BasicExercise1;

// Write a Java program to count the letters,
// spaces, numbers and other characters of an input string
public class P25 {
    public static void main(String[] args) {

        String str = " Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
        char[] letters = str.toCharArray();

        int letterCounter = 0, spaceCounter = 0, otherCounter = 0;
        System.out.println("Total Character: " + letters.length);

        for(int i = 0; i < letters.length; i++){
            if(Character.isAlphabetic(letters[i]))
                letterCounter++;
            else if (Character.isWhitespace(letters[i]))
                spaceCounter++;
            else
                otherCounter++;
        }

        System.out.println("Letters: " + letterCounter + '\n' +
                "Space: " + spaceCounter + '\n' + "Others: " + otherCounter);
    }
}
