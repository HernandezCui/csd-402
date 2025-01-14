import java.util.Scanner;

public class WaterHeatingCalculator {

    public static void main(String[] args) {
        // Create a Scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the amount of water in kilograms
        System.out.print("Enter the amount of water (in kilograms): ");
        double waterMass = scanner.nextDouble();

        // Prompt user for the initial temperature in Celsius
        System.out.print("Enter the initial temperature (in Celsius): ");
        double initialTemperature = scanner.nextDouble();

        // Prompt user for the final temperature in Celsius
        System.out.print("Enter the final temperature (in Celsius): ");
        double finalTemperature = scanner.nextDouble();

        // Calculate the energy in Joules using the formula
        double energy = waterMass * (finalTemperature - initialTemperature) * 4184;

        // Display the result
        System.out.printf("The energy required to heat %.2f kg of water from %.2f°C to %.2f°C is %.2f Joules.%n", 
                          waterMass, initialTemperature, finalTemperature, energy);

        // Close the scanner object to prevent memory leaks
        scanner.close();
    }
}
