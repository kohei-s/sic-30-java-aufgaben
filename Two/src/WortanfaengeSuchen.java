public class WortanfaengeSuchen {
    public void findWordStartWithParticularLetter(String text, String targetLetter){
        String[] words = text.split(" ");
        for (String word : words) {
            if (word.toLowerCase().startsWith(targetLetter.toLowerCase())){
                System.out.println(word + " starts with the letter " + targetLetter);
            }
        }
    }
}
