public class ZahlenSortieren {

    public void sortNumbers (int num1, int num2, int num3) {
        int firstNumber;
        int secondNumber;
        int thirdNumber;

        if (num1 > num2) {
            if (num2 > num3) {
                firstNumber = num3;
                secondNumber = num2;
                thirdNumber = num1;
            } else {
                firstNumber = num2;
                if (num3 > num1) {
                    secondNumber = num1;
                    thirdNumber = num3;
                } else {
                    secondNumber = num3;
                    thirdNumber = num1;
                }
            }
        } else if (num1 > num3) {
            firstNumber = num3;
            secondNumber = num1;
            thirdNumber = num2;
        } else {
            firstNumber = num1;
            if (num2 > num3) {
                secondNumber = num3;
                thirdNumber = num2;
            } else {
                secondNumber = num2;
                thirdNumber = num3;
            }
        }
        System.out.println(firstNumber + ", " + secondNumber + ", " + thirdNumber);
    }
}
