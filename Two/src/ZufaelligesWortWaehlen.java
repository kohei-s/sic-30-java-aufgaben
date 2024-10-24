import java.util.Random;
public class ZufaelligesWortWaehlen {
    public void randomWord(String[] wordList) {
        Random rand = new Random();
        int index = rand.nextInt(wordList.length - 1);
        System.out.println(wordList[index]);
    }
}
