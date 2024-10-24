public class WoerterRueckwaertsAusgeben {
    public void reverseWord(String word) {
        char[] chars = word.toCharArray();
        for (int i = 0; i < chars.length/2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = temp;
        }
        word = new String(chars);
        System.out.println(word);
    }
}
