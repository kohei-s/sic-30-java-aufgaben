public class TextersetzungInSaetzen {
    public void replaceWords(String text) {
        String target1 = "gestern";
        String target2 = "morgen";
        text = text.replace(target1, "vorgestern");
        text = text.replace(target2, "übermorgen");
        System.out.println(text);
    }
}
