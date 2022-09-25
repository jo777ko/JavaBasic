import java.util.Random;
import java.util.Scanner;

/**
 * Java Basic. HomeTask5
 * 
 * @authur Geork (Жора)
 * @todo 19.09.2022
 * @date 25.09.2022
 */
public class HomeTask5 {
    public static void main (String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        String[] words = {"apple", "woman", "pizza", "sweet", "eagle"};
        String word = words[random.nextInt(words.length)];
        char[] mask = {'#','#', '#', '#', '#'};
        int counter = 0;
        int letterCounter =0;
        do {
            counter ++;
            System.out.print("Guess the words: [" + new String(mask) + "]: ");
            char letter = scanner.next().charAt(0);
            for (int i = 0; i < word.length(); i++) {
                if (letter == word.charAt(i) && mask[i] == '#') {
                    mask[i] = letter;
                    letterCounter++;
                }
            }
        } while (letterCounter < word.length());
        System.out.println("You guess the word [" + word + "], attempts: " + counter);
    }
}