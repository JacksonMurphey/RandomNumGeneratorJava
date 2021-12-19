import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;


public class Puzzle {
    Random randomGen = new Random();

    public ArrayList<Integer> getTenRolls() {
        // Random randomGen = new Random();
        ArrayList<Integer> randomRolls = new ArrayList<Integer>();
        for (int i = 0; i<10; i++) {
            int newNum = randomGen.nextInt(21); // nextInt(20) Here, (20) is exclusive. thus I put 21 so it would generate nums between 0-20
            randomRolls.add(newNum);
        }
        return randomRolls;
    }

    public ArrayList<Object> getRandomLetters() {
        // Random randomGen = new Random();
        ArrayList<Object> randomLetters = new ArrayList<Object>();
        
        for(int i =0; i<26; i++) {
            char l = (char)(randomGen.nextInt(26) + 'a');
            // try calling my below method to get a random letter instead of writing it twice. 
            randomLetters.add(l);
        }
        return randomLetters;
    }

    public char getRandomLetter() {
        // Random randomGen = new Random();
        // ArrayList<Object> randomLetter = new ArrayList<Object>();
        // char random = 'a';
        // for(int i =0; i<26; i++) {
        //     char l = (char)(randomGen.nextInt(26) + 'a');
        //     randomLetter.add(l);
        // }
        char random = (char)(randomGen.nextInt(26) + 'a');
        return random;
    }

    public String generatePassword(int input) {
        // Puzzle.getRandomLetters();
        // ArrayList<Object> randomLetters = new ArrayList<Object>();
        // Random randomGen = new Random();
        String letters = "";
        
        for(int i = 0; i<input; i++){
            // i = (char)(randomGen.nextInt(26) + 'a');
            // letters = String.valueOf(i);
            // letters = sb.append(a).toString();
            // this.getRandomLetter();
            // System.out.println(this.getRandomLetter());
            letters += this.getRandomLetter();
        }
        
        return letters;

    }

    // public String[] shuffleArray(String[] arr) {
    //     ArrayList<String> newArr = new ArrayList<String>();
    //     for(int i = 0; i<arr.length; i++) {

    //     }
    //     return newArr;
    // }



// ############# Below is code is from the Solutions #######################

    // public ArrayList<Integer> getTenRolls() {

    //     ArrayList<Integer> random10 = new ArrayList<Integer>();
    //     Random rand = new Random();

    //     for (int i = 1; i <=10; i++) {
    //         random10.add(rand.nextInt(20) + 1);
    //     }

    //     return random10;
    // }


    // getRandomLetter
    // Write a method that will:
    // Create an array or other datatype within the method that contains all 26 letters of the alphabet (must have 26 values). 
    // Generate a random index between 0-25, and use it to pull a random letter out of the array.
    // Return the random letter.

    // Possible solution with array
    public String getRandomLetterWithArray() {
        Random rand = new Random();
        
        String alphabetString = "abcdefghijklmnopqrstuvwxyz";
        String[] alphabet = new String[26];
        for (int i = 0; i < 26; i++) {
            alphabet[i] = String.valueOf(alphabetString.charAt(i));
        }
        return alphabet[rand.nextInt(26)];
    }
    // Possible solution without array
    // public String getRandomLetter() {

    //     Random rand = new Random();
    //     String alphabetString = "abcdefghijklmnopqrstuvwxyz";
    //     char randomChar = alphabetString.charAt(rand.nextInt(26));

    //     return String.valueOf(randomChar);
    // }

    // generatePassword
    // Write a method that uses the previous method to create a random 
    // string of eight characters, and return that string.
    public String generatePassword() {

        String password = "";

        for(int i = 0; i < 8; i++) {
            password = password + getRandomLetter();
        }
        return password;
    }


    // getNewPasswordSet
    // Write a method that takes an int length as an argument 
    // and creates an array of random eight character words. 
    // The array should be the length passed in as an int.
    public ArrayList<String> getNewPasswordSet(int length) {

        ArrayList<String> passwordSet = new ArrayList<String>();
        for(int i = 0; i < length; i++) {
            passwordSet.add(generatePassword());
        }
        return passwordSet;

    }


}

