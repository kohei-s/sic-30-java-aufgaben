public class PlatzhalterErsetzen {
    public void placeholder(String text, String userInput) {
        String[] ph = {"[Name]"};
        String result = text;
        for (String s : ph) {
            result = (text.replace(s, userInput));
        }
        System.out.println(result);
    }
}
