public class GeradeOderUngeradeZahl {
    public void checkOddOrEven(int number) {
        if (number == 0) {
            System.out.println("It is a zero");
        } else {
            System.out.println("It is an " + ((number % 2 == 0)? "even": "odd") + "number.");
        }
    }
}
