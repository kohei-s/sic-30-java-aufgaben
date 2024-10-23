public class Zeichenzaehlung {

    public void countCharacters(String text) {
        int len = text.length();
        int count = 0;
        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                count++;
            }
        }
        System.out.println("Number of characters: " + count);
    }
}
