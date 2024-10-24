import java.util.Arrays;
public class HaeufigsteBuchstabenZaehlen {
    public void findFrequentLetter(String text) {
        char[] letters = text.toLowerCase().toCharArray();
        Arrays.sort(letters);
        char[] alphabets = {'a', 'b', 'c', 'd', 'e', 'f',
                'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
                'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int[] counts = new int[26];
        for (int i = 0; i < alphabets.length; i++) {
            for (char l : letters) {
                if (alphabets[i] == l) {
                    counts[i] += 1;
                }
            }
        }
        int max = counts[0];
        int index = 0;
        for (int j = 0; j < 26; j++) {
            if (counts[j] > max) {
                index = j;
            }
        }
        System.out.println(alphabets[index]);
    }
}
