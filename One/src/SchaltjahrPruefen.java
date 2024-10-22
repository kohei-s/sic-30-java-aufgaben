public class SchaltjahrPruefen {

    public void islLeapYear(int year) {
        boolean leap;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    leap = true;
                } else {
                    leap = false;
                }
            } else {
                leap = true;
            }
        } else {
            leap = false;
        }
        System.out.println("The year " + year + " is " + ((leap)? "": "not") + " a leap year.");
   }
}
