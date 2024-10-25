public class MehrfacheLeerzeichenEntfernen {
    public void removeTwoSpaces(String text){
        System.out.println(text.replaceAll("[ ]{2}", " "));
    }
}
