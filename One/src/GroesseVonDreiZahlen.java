public class GroesseVonDreiZahlen {

    public void maxNumber (int num1, int num2, int num3) {
//        int max = Math.max(num1, Math.max(num2, num3));
        int max;
        if (num1 > num2) {
            if (num1 > num3) {
                max = num1;
            } else {
                max = num3;
            }
        } else if (num2 > num3) {
            max = num2;
        } else {
            max = num3;
        }

        System.out.println("The max number is " + max);

    }
}
