import java.util.Arrays;

public class ZahlenfolgeUmdrehen {

    public void reverseArray (int[] numbers) {
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - i - 1];
            numbers[numbers.length - i - 1] = temp;
        }
        System.out.println("Reversed array: " + Arrays.toString(numbers));
    }
}
