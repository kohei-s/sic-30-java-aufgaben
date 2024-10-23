public class PalindromePruefen {

    public void isPalindrome(String word) {
        StringBuilder sb = new StringBuilder(word);
        sb.reverse();

        System.out.println(word + " is " + (!(word.toLowerCase().equals(sb.toString().toLowerCase()))? "not" : "") + " a palindrome");
    }
}
