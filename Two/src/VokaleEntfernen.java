public class VokaleEntfernen {
    public void removeVowel(String text) {
        /*String result = "";
        result = text.replaceAll("[aeiou]", "");*/
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        StringBuilder sb = new StringBuilder(text);
        for (char c : vowels){
            for (int i = 0; i < sb.length(); i++){
                if (sb.charAt(i) == c){
                    sb.deleteCharAt(i);
                }
            }
        }
        System.out.println(sb.toString());
    }
}
