public class SummierenDerErstenNZahlen {
    public void sum (int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
