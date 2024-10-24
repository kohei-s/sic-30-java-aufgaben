public class PlagiateErkennen {
    public void detectPlagiarism (String text1, String text2) {
        int similarityThreshold = 70;
        String[] words1 = text1.split(" ");
        String[] words2 = text2.split(" ");
        double length = Math.max(words1.length, words2.length);
        double countMatch = 0;
        for (String w1 : words1) {
            for (String w2 : words2) {
                if (w1.equals(w2)) {
                    countMatch++;
                }
            }
        }

        int matchRate = (int)((countMatch/length) * 100);
        System.out.println((matchRate >= similarityThreshold? "" : "Not ") + "a plagiarism");
    }
}
