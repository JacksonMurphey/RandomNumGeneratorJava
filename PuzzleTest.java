import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;


public class PuzzleTest {

    public static void main(String[] args) {
        Puzzle generator = new Puzzle();

        ArrayList<Integer> randomRolls = generator.getTenRolls();
        System.out.println(randomRolls);

        ArrayList<Object> randomLetters = generator.getRandomLetters();
        System.out.println(randomLetters);

        char rand = generator.getRandomLetter();
        System.out.println(rand);

        String passWord = generator.generatePassword(8);
        System.out.println(passWord);


    }

}