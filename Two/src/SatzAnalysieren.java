public class SatzAnalysieren {
    public void analyseText (String text) {
        int wordCount = 0, letterCount = 0, sentenceCount = 0;
        letterCount = text.length();
        String[] words = text.split(" ");
        wordCount = words.length;
        String[] sentences = text.split("\\.");
        sentenceCount = sentences.length;
        System.out.println(letterCount + " letters, "
                + wordCount + " words, "
                + sentenceCount + " sentences");
    }
}
