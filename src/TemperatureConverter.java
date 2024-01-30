import java.util.Scanner;
public final class TemperatureConverter {
    private static final String UTILITIES_CLASS_ERROR = "This class should not be instantiated.";
    private static final String INPUT = "Enter temperature value: ";
    private static final String ORIGINAL_UNIT = "Enter original unit (C for Celsius, F for Fahrenheit, K for Kelvin): ";
    private static final String CELSIUS_UNIT = "Celsius: ";
    private static final String FAHRENHEIT_UNIT = "Fahrenheit: ";
    private static final String KELVIN_UNIT = "Kelvin: ";
    private static final String TEMPERATURE_LABEL_PREFIX = "Converted Temperatures:";
    private TemperatureConverter() {
        System.out.println(UTILITIES_CLASS_ERROR);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print(INPUT);
        double temperature = scanner.nextDouble();

        // Prompt user for the original unit of measurement
        System.out.print(ORIGINAL_UNIT);
        char originalUnit = scanner.next().charAt(0);

        // Convert temperature and display results
        displayConvertedTemperatures(temperature, originalUnit);

        scanner.close();
    }

    private static void displayConvertedTemperatures(double temperature, char originalUnit) {
        TemperatureConversion converter = new TemperatureConversion();
        System.out.println(TEMPERATURE_LABEL_PREFIX);
        System.out.println(CELSIUS_UNIT + converter.toCelsius(temperature, originalUnit));
        System.out.println(FAHRENHEIT_UNIT + converter.toFahrenheit(temperature, originalUnit));
        System.out.println(KELVIN_UNIT + converter.toKelvin(temperature, originalUnit));
    }
}
