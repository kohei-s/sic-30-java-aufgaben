public class FakultaetBerechnen {

    /*public void factorial(int n) {
       int result = 1;
        for (int i = n; i >0; i--) {
            result *= i;
        }
        System.out.println("The factorial of " + n + " is " + result + ".");
    }*/

    public int factorial(int n) {
        int result = 0;
        if (n == 0 || n == 1) {
            result = 1;
        } else {
            result = n * factorial(n-1);
        }
        return result;
    }


}
