import java.util.Arrays;
public class AnagrammePruefen {
    public void isAnagram(String a, String b) {
        int len1 = a.length();
        int len2 = b.length();
        char[] chars1 = a.toLowerCase().toCharArray();
        Arrays.sort(chars1);
        char[] chars2 = b.toLowerCase().toCharArray();
        Arrays.sort(chars2);
        if (len1 != len2) {
            System.out.println("Not anagram");
        } else if (Arrays.compare(chars1, chars2) == 0) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not anagram");
        }
    }
}
