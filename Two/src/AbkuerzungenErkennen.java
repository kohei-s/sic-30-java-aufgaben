public class AbkuerzungenErkennen {
    public void findAbbreviation(String text) {
        int count = 0;
        String regex = "\\b[A-Z]{2,}(?:\\.[A-Z]{2,})*\\b";
        String[] words = text.split(" ");
        for (String word : words) {
            String cleanWord = word.replaceAll("[.]", "");
            System.out.println(cleanWord);
            if (cleanWord.matches(regex)) {
                System.out.println(word + " is an abbreviation.");
                count++;
            }
        }
        System.out.println(count + " abbreviations were found.");
    }
}
