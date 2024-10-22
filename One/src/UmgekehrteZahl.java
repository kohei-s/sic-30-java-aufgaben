public class UmgekehrteZahl {
    public void reverseNumber(int number) {
        int originalNumber = number;
        int temp = 0;

        while (number > 0) {
            temp *= 10;
            temp += (number % 10);
            number = number / 10;
        }
        System.out.println("The reversed number of " + originalNumber + " is " + temp);
    }
}
