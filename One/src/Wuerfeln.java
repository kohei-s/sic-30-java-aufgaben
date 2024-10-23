import java.util.Random;

public class Wuerfeln {
    public void rollDice () {
        Random rand = new Random();
        System.out.println(rand.nextInt(1,6));
    }
}
