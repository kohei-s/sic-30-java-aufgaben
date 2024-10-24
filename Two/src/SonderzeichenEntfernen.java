public class SonderzeichenEntfernen {
    public void removeSpecialCharacters(String text) {
        String result;
        result = text.replaceAll("[^\\p{L}\\p{Z}]","");
        System.out.println(result);
    }
}
