public class FibonacciFolge {

    public void fibonacci(int n) {

        int firstNumber = 0, secondNumber = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(firstNumber + " ");
            int thirdNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = thirdNumber;
        }
        System.out.println();
    }


}
