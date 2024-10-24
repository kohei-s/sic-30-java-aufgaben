import java.util.Random;
import java.util.Scanner;
public class WortspielHangman {
    public void hangman(String guess) {
        String[] words = {"apple", "banana", "lemon", "orange", "watermelon"};
        Random rand = new Random();
        String answer = words[rand.nextInt(words.length)];
        if (answer.equals(guess)) {
            System.out.println("You guessed correctly!");
        } else {
            System.out.println("You lost!");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 5;
        while (count > 0) {
            System.out.println("Guess which fruit I'm thinking about: ");
            String guess = sc.nextLine();
            WortspielHangman hangman = new WortspielHangman();
            hangman.hangman(guess);
            count--;
        }
    }
}
