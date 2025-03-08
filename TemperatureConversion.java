import java.util.Scanner;

public class TemperatureConversion {
    
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        System.out.println("Temperature in Celsius: " + fahrenheitToCelsius(fahrenheit));

        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();
        System.out.println("Temperature in Fahrenheit: " + celsiusToFahrenheit(celsius));

        input.close();
    }
}
