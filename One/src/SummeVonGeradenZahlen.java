public class SummeVonGeradenZahlen {

    public void sum(int number) {
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
