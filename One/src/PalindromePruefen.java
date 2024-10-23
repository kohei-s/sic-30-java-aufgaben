public class PalindromePruefen {

    public void isPalindrome(String word) {
        StringBuilder sb = new StringBuilder(word);
        sb.reverse();

        System.out.println(word + " is " + (!(word.equalsIgnoreCase(sb.toString()))? "not" : "") + " a palindrome");
    }
}
