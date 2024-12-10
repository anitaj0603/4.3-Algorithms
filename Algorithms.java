import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Algorithms {
    private File file;

    public Algorithms(File file) {
        this.file = file;
    }

    public int countTwoLetterWords() throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        int count = 0;
        while (scanner.hasNext()) {
            String word = scanner.next();
            if (word.length() == 2) {
                count++;
            }
        }
        scanner.close();
        return count;
    }

    public int countLongestWords() throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        int maxLength = 0;
        int count = 0;
        while (scanner.hasNext()) {
            String word = scanner.next();
            if (word.length() > maxLength) {
                maxLength = word.length();
                count = 1;
            } else if (word.length() == maxLength) {
                count++;
            }
        }
        scanner.close();
        return count;
    }

    public int countPalindromes() throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        int count = 0;
        while (scanner.hasNext()) {
            String word = scanner.next();
            if (isPalindrome(word)) {
                count++;
            }
        }
        scanner.close();
        return count;
    }

    private boolean isPalindrome(String word) {
        String reversed = new StringBuilder(word).reverse().toString();
        return word.equals(reversed);
    }
}