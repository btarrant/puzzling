import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava {

    //getTenRolls
    //Write a method that will generate and return an array with 10 random numbers between 1 and 20 inclusive.

    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> random10 = new ArrayList<Integer>();
        Random rand = new Random();
        for(int i = 1; i <= 10; i++) {
            random10.add(rand.nextInt(20) + 1);
        }
        return random10;
    }

    //getRandomLetter
    /* Write a method that will...
        1. Create an array or other datatype within the method that contains all 
        26 letters of the alphabet (must have 26 values).
        2. Generate a random index between 0-25, and use it to pull a random letter out of the array.
        3. Return the random letter.
    */

    public String getRandomLetter() {
        String alphabetString = "abcdefghijklmnopqrstuvwxyz";
        Random rand = new Random();
        String[] alphabet = new String[26];
        for(int i = 0; i < 26; i++) {
            alphabet[i] = String.valueOf(alphabetString.charAt(i));
        }
        return alphabet[rand.nextInt(26)];
    }
}