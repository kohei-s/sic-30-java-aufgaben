public class PalindromeInEinemTextFinden {
    public void findPalindrome (String text) {
        text = text.replaceAll("[.,]", "").toLowerCase();
        StringBuilder sb = new StringBuilder(text);
        String text2 = sb.reverse().toString();
        System.out.println(text2);
        String[] words = text.split(" ");
        String[] words2 = text2.split(" ");
        for(String word : words) {
            for(String word2 : words2) {
                if(word.equals(word2)) {
                    System.out.println(word);
                }
            }
        }
    }
}
