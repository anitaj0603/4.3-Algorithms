import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("words.txt");
        Algorithms algo = new Algorithms(file);

        System.out.println("Number of two-letter words: " + algo.countTwoLetterWords());
        System.out.println("Number of longest words: " + algo.countLongestWords());
        System.out.println("Number of palindromes: " + algo.countPalindromes());
    }
}