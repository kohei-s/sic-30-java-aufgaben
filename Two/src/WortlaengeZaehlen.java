public class WortlaengeZaehlen {
    public void countCharacter(String word) {
//        int count = word.length();
        char[] characters = word.toCharArray();
        int count = 0;
        for (char c : characters) {
            count++;
        }
        System.out.println(count);
    }
}
