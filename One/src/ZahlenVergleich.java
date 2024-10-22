public class ZahlenVergleich {

    public void checkNumber (int number) {
        System.out.println("It is a " + ((number == 0)? "zero/null": (number > 0)? "positive number" : "negative number") + ".");
    }
}
