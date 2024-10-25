public class HTMLTagEntfernen {
    public void removeHTMLTag(String text) {
        String regex = "<[^>]+>";
        String[] words = text.split(" ");
        for (String word : words) {
            if (word.matches(regex)) {
                System.out.println(word + " is a HTML tag.");
            }
        }
        System.out.println(text.replaceAll(regex, ""));
    }
}
