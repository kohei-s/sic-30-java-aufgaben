public class WortlaengeVergleichen {
    public void compareLength (String word1, String word2) {
        int w1 = word1.length();
        int w2 = word2.length();
        System.out.println((w1 == w2)? (word1 + ", " + word2) : (w1 > w2)? word1 : word2);
    }
}
