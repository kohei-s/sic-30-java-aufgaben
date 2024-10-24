import java.util.Arrays;
public class WoerterAlphabetischSortieren {
    public void sortWords(String text) {
        String[] words = text.split(" ");
        Arrays.sort(words);
        for (String word : words) {
            System.out.print(word + " ");
        }
    }
}
