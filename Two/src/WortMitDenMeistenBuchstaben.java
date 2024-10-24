import java.util.Arrays;
public class WortMitDenMeistenBuchstaben {
    public void findLongestWord(String text) {
        String[] words = text.split(" ");
        System.out.println(Arrays.toString(words));
        int maxLength = 0;
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
                sb = new StringBuilder(word);
            } else if (word.length() == maxLength) {
                sb.append(" ").append(word);
            }
        }
        System.out.println(sb.toString());
    }
}
