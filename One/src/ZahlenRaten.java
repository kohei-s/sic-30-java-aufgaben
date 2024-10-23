import java.util.Random;

public class ZahlenRaten {
    public void guessNumber(int n) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(10);
        if (randomNumber == n) {
            System.out.println("You guessed the number correctly!");
        } else {
            System.out.println("You guessed the number incorrectly!");
        }
    }

}
