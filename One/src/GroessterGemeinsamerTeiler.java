public class GroessterGemeinsamerTeiler {
    public void highestCommonFactor(int a, int b) {
       int result = 1;

        int smallerNumber;
        if (a < b) {
            smallerNumber = a;
        } else {
            smallerNumber = b;
        }

        for (int i = smallerNumber; i > 1; i--) {
            if (a % i == 0 && b % i == 0) {
                    result = i;
                    break;
            }
        }

        System.out.println(result);
    }
}
