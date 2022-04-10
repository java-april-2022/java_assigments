import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava{

/*1. getTenRolls
Write a method that will generate and return an 
array with 10 random numbers between 1 and 20 inclusive.*/

    public ArrayList<Integer> getTenRolls(){

        ArrayList<Integer> random10 = new ArrayList<Integer>();
        Random rand = new Random();

        for (int i=1; i<= 10; i++){
            random10.add(rand.nextInt(20)+1);
        }
        return random10;
    }

/* 2. getRandomLetter

Write a method that will:

Create an array within the method that contains all 26 letters of the alphabet (this array must have 26 values). 
Generate a random index between 0-25, and use it to pull a random letter out of the array.
Return the random letter. */

    public String getRandomLetterWithArray(){
        Random rand = new Random();

        String alphaString = "abcdefgfhijklmnopqrstuvwxyz";
        String[] alphabet = new String[26];
        for (int i = 0; i<=26; i++){
            alphabet[i] = String.valueOf(alphaString.charAt(i));
        }
        return alphabet[rand.nextInt(26)];
    }

    /* solution without Array */

    public String getRandomLetter(){

        Random rand = new Random();
        String alphabeString = "abcdefgfhijklmnopqrstuvwxyz";
        char randomChar = alphabeString.charAt(rand.nextInt(26));

        return String.valueOf(randomChar);
    }

/* 3. generatePassword

Write a method that uses the previous method to create a random string of eight characters, and return that string. */

    public String generatePassword() {

        String password = "";

        for (int i=0; i<8; i++){
            password = password + getRandomLetter();
        }
        return password;
    }

/* 4. getNewPasswordSet

Write a method that takes an int length as an argument and creates an array of random eight character words. 
The array should be the length passed in as an int. */

    public ArrayList<String> getNewPasswordSet(int length){
        ArrayList<String> passwordSet =new ArrayList<String>();
        for (int i=0; i< length; i++){
            passwordSet.add(generatePassword());
        }
        return passwordSet;
    }

}
