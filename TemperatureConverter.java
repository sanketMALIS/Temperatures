import java.util.Scanner;

public class TemperatureConverter {

  // Method to convert Celsius to Fahrenheit
  public static double celsiusToFahrenheit(double celsius) {
    return (celsius * 9 / 5) + 32;
  }

  // Method to convert Fahrenheit to Celsius
  public static double fahrenheitToCelsius(double fahrenheit) {
    return (fahrenheit - 32) * 5 / 9;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Ask user for the temperature value
    System.out.print("Enter temperature value: ");
    double temperature = scanner.nextDouble();

    // Ask user for the unit of the temperature
    System.out.print(
      "Is the temperature in Celsius (C) or Fahrenheit (F)? Enter C or F: "
    );
    char unit = scanner.next().toUpperCase().charAt(0);

    // Perform the conversion based on the input unit
    if (unit == 'C') {
      double convertedTemp = celsiusToFahrenheit(temperature);
      System.out.println(
        temperature + "°C is equal to " + convertedTemp + "°F."
      );
    } else if (unit == 'F') {
      double convertedTemp = fahrenheitToCelsius(temperature);
      System.out.println(
        temperature + "°F is equal to " + convertedTemp + "°C."
      );
    } else {
      System.out.println(
        "Invalid input. Please enter C for Celsius or F for Fahrenheit."
      );
    }

    // Close the scanner
    scanner.close();
  }
}
