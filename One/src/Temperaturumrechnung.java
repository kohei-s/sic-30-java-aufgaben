public class Temperaturumrechnung {

    public void convertCelsiusAndFahrenheit(double temperature, String unit) {
        if (unit.equalsIgnoreCase("celsius")) {
            double fahrenheit = (temperature * 9) / 5 + 32;
            System.out.println("Fahrenheit: " + fahrenheit);
        } else if (unit.equalsIgnoreCase("fahrenheit")) {
            double celsius = (temperature - 32) * 5 / 9;
            System.out.println("Celesius: " + celsius);
        } else {
            System.out.println("Invalid input");
        }
    }
}
