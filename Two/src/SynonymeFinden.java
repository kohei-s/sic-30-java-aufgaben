import java.util.Arrays;
public class SynonymeFinden {
    public void findSynonym(String selectedWord) {
        String[] wordList = {"a", "b", "c"};
        String[][] synonyms = new String[wordList.length][];
        String[] synonymA = {"d", "e"};
        String[] synonymB = {"f", "g", "h", "i"};
        String[] synonymC = {"j", "k", "l"};
        synonyms[0] = synonymA;
        synonyms[1] = synonymB;
        synonyms[2] = synonymC;
        System.out.println("Synonym(s) of " + selectedWord + ": " +
                ((selectedWord.equals("a")) ? Arrays.toString(synonyms[0]) :
                        (selectedWord.equals("b")) ? Arrays.toString(synonyms[1]) :
                                Arrays.toString(synonyms[2])));
    }
}
