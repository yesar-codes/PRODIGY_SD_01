public class TemperatureConversion {
    private static final double FAHRENHEIT_TO_CELSIUS_SCALE = 5.0 / 9.0;
    private static final double CELSIUS_TO_FAHRENHEIT_SCALE = 9.0 / 5.0;
    private static final double CELSIUS_TO_KELVIN_OFFSET = 273.15;
    private static final double FAHRENHEIT_TO_CELSIUS_OFFSET = 32.0;
    private static final char FAHRENHEIT_UNIT = 'F';
    private static final char KELVIN_UNIT = 'K';
    public double toCelsius(double temperature, char originalUnit) {
        double celsius = temperature;  // Create a copy to avoid modifying the original parameter directly
        switch (originalUnit) {
            case FAHRENHEIT_UNIT -> celsius = (temperature - FAHRENHEIT_TO_CELSIUS_OFFSET) * FAHRENHEIT_TO_CELSIUS_SCALE;
            case KELVIN_UNIT -> celsius -= CELSIUS_TO_KELVIN_OFFSET;
            default -> {// If originalUnit is neither 'F' nor 'K', do nothing (celsius remains unchanged)
            }
        }
        return celsius;
    }

    public double toFahrenheit(double temperature, char originalUnit) {
        double celsius = toCelsius(temperature, originalUnit);
        return (celsius * CELSIUS_TO_FAHRENHEIT_SCALE) + FAHRENHEIT_TO_CELSIUS_OFFSET;
    }

    public double toKelvin(double temperature, char originalUnit) {
        double celsius = toCelsius(temperature, originalUnit);
        return celsius + CELSIUS_TO_KELVIN_OFFSET;
    }
}
