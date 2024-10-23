public class DurchschnittBerechnen {

    public void mean(int[] numbers) {
        int sum = 0;
        int len = numbers.length;
        for (int n : numbers) {
            sum += n;
        }
        System.out.println("The mean is " + sum/len);
    }
}
