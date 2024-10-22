public class FakultaetBerechnen {

    /*public void factorial(int n) {
       int result = 1;
        for (int i = n; i >0; i--) {
            result *= i;
        }
        System.out.println("The factorial of " + n + " is " + result + ".");
    }*/

    public int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }


}
