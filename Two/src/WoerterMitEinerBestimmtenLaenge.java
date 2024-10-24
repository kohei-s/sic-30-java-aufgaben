public class WoerterMitEinerBestimmtenLaenge {
    public void findWords(String text, int wordLength) {
        String[] words = text.split(" ");
        for (String word : words) {
            if (word.length() == wordLength) {
                System.out.println(word);
            }
        }
    }
}
