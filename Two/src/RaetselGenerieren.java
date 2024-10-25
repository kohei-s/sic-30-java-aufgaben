import java.util.Random;
import java.util.Scanner;
public class RaetselGenerieren {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] riddles = new String[3];
        riddles[0] = """
                I speak without a mouth and hear without ears." \
                "I have nobody, but I come alive with wind. What am I?""";
        riddles[1] = """
                I am not alive, but I grow; I don’t have lungs, but I need air; \
                I don’t have a mouth, and I can drown easily. What am I?""";
        riddles[2] = """
                The more of this there is, the less you see. What is it?""";
        Random rand = new Random();
        final int riddleNumber = rand.nextInt(3);
        System.out.println(riddles[riddleNumber]);
        String answer = sc.nextLine();
        String check = switch (riddleNumber) {
            case 0 -> (answer.equalsIgnoreCase("echo") ? "" : "not") + " correct";
            case 1 -> (answer.equalsIgnoreCase("fire") ? "" : "not") + "correct";
            case 2 -> (answer.equalsIgnoreCase("darkness") ? "" : "not") + "correct";
            default -> "an invalid input!";
        };
        System.out.println("Your answer is " + check);
        sc.close();
    }
}
