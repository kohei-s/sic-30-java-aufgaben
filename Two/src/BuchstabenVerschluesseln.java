public class BuchstabenVerschluesseln {
    public void encryptCaeserCipher(String cipher) {
        int offset = 5;
        char[] letters = cipher.toCharArray();
        StringBuilder encrypted = new StringBuilder();
        for (char letter: letters) {
            encrypted.append((char)((int)letter + offset));
        }
        System.out.println(encrypted);
    }
}
