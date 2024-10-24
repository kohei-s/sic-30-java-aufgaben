public class ZeilenumbruchHinzufuegen {
    public void lineBreak(String text) {
        StringBuilder sb = new StringBuilder();
        int wordCount = 0;
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            if(wordCount < 5) {
                sb.append(words[i]);
                sb.append(" ");
                wordCount++;
                continue;
            } else if (wordCount == 5) {
                sb.append("\n");
                sb.append(words[i]);
                sb.append(" ");
                wordCount = 1;
            }
        }
        System.out.println(sb);
    }
}
