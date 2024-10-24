public class ZaehlungVonBestimmtenWoertern {
    public void countWord(String text) {
        String targetWord = "ist";
        int count;
        for (count = 0; text.contains(targetWord); count++) {
            text = text.replaceFirst(targetWord, "");
            System.out.println(text);
        }
        System.out.println(count);
    }
}