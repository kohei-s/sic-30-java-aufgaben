public class VokalenZaehlen {

    public void isVowel(String word) {
        int count = 0;
        String[] vowels = {"a", "e", "i", "o", "u"};
        word = word.toLowerCase();

        for (int i = 0; i < word.length(); i++) {
            for (String vowel : vowels) {
                if (word.charAt(i) == vowel.charAt(0)) {
                    count++;
                }
            }
        }

        System.out.println("There " + ((count > 1)? "are " : "is ") + count + " vowl" + ((count > 1)? "s." : "."));
    }
}
