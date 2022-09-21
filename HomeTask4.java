import java.util.Random;
import java.util.Scanner;
import java.io.IOException;
/**
 * Java Basic. HomeTask4
 * 
 * @authur Geork (Жора)
 * @todo 14.09.2022
 * @date 21.09.2022
 */
public class HomeTask4 {
    public static char randomChar() {
        Random random = new Random();
        //Scanner scanner = new Scanner(System.in);
        int rand = new Random().nextInt(52);
        
        char start = (rand < 26) ? 'A' : 'a';
        return (char) (start + rand % 26);
    }
 
    public static void main(String[] args) throws IOException {
            char c = randomChar();
            char ch = 'a';
            System.out.print("Guess the symbol: ");
            ch = (char)System.in.read();
                if (c ==ch) {
                    System.out.println("You guess");
                } else {
                    System.out.println("You don't guess");
                }
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int digit = 1;
        int x = 0;
        
        do {
            digit = random.nextInt(3);
            for (int i = 0; i < 3; i++ ) {
                System.out.print("Guess the digit [0...3]: ");
                x = scanner.nextInt();
                if (x > digit) {
                    System.out.println("Your digit is higher");
                } else if (x < digit) {
                    System.out.println("Your digit is lesser");
                } else {
                     System.out.println("You guess my digit");
                     break;
                }
            }
            if (digit != x) {
                 System.out.println("You lose");
            }
             System.out.println("Will you try again? Yes - 1, No - 0: ");
        }while (scanner.nextInt() == 1);
    }
}