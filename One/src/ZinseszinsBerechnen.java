public class ZinseszinsBerechnen {

    public void compoundInterest (double principal, double rate, double time) {
        double compoundInterest = principal;
        for (int i = 0; i < time; i++) {
            compoundInterest += principal * (rate / 100);
        }

        System.out.println(compoundInterest);
    }
}
