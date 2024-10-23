public class ZeichenUmwandeln {
    public void changeCase(String word) {
        int length = word.length();
        char[] characters = new char[length];
        for (int i = 0; i < length; i++) {
            char ch = word.charAt(i);
            ch = Character.isUpperCase(ch)? Character.toLowerCase(ch): Character.toUpperCase(ch);
            characters[i] = ch;
        }
        System.out.println(new String(characters));
    }
}
