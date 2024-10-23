public class KleinsterGemeinsamerVielfaches {
    public void leastCommonMultiple(int a, int b) {

        int result = 1;

        while (true) {
            if (result % a == 0 && result % b == 0) {
                break;
            }
            result++;
        }

        System.out.println(result);
    }

}
