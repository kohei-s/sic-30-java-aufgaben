public class SatzAnalysieren {
    public void analyseText (String text) {
        int wordCount, letterCount, sentenceCount;
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
