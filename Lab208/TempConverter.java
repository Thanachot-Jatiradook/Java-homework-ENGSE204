package Lab208;

import java.util.Scanner;

public class TempConverter {

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0/5.0) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0/9.0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which one that you want to covert to :     ");
        String mode = scanner.nextLine();

        System.out.println("Enter your Temp :     ");
        double inputTemp = scanner.nextDouble();

        if (mode.equals("C_TO_F")) {
            double result = TempConverter.celsiusToFahrenheit(inputTemp);
            System.out.println(result);
        }

        else if (mode.equals("F_TO_C")) {

            double result = TempConverter.fahrenheitToCelsius(inputTemp);
            System.out.println(result);
        }
        else {
            System.out.println("Wrong mode");
        }

        scanner.close();
    }
}
