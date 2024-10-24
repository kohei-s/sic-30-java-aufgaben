public class SatzInPigLatinUmwandeln {
    public void translateToPigLatin(String original) {
        String targetWord1 = "ist";
        String targetWord2 = "tag";
        while (original.contains(targetWord1)) {
            original = original.replaceFirst(targetWord1, "brunz");
        }
        while (original.contains(targetWord2)) {
            original = original.replaceFirst(targetWord2, "oink");
        }
        System.out.println(original);
    }
}
