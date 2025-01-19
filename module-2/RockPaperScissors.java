import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Define the choices for the game
        String[] choices = {"Rock", "Paper", "Scissors"};

        // Create a Random object for the computer's random choice
        Random random = new Random();

        int computerChoice = random.nextInt(3);

        // Ask the user for their choice
        System.out.println("Welcome to Rock-Paper-Scissors!");
        System.out.println("Please choose:");
        System.out.println("1 - Rock");
        System.out.println("2 - Paper");
        System.out.println("3 - Scissors");

        // Get the user's choice (1, 2, or 3)
        System.out.print("Enter your choice (1, 2, or 3): ");
        int userChoice = scanner.nextInt() - 1;  // Convert to 0, 1, or 2

        // Check for valid input
        if (userChoice < 0 || userChoice > 2) {
            System.out.println("Invalid input! Please enter a number between 1 and 3.");
            scanner.close();
            return;
        }

        // Display the choices
        System.out.println("\nComputer's choice: " + choices[computerChoice]);
        System.out.println("Your choice: " + choices[userChoice]);

        // Determine the winner
        if (computerChoice == userChoice) {
            System.out.println("\nIt's a tie!");
        } else if ((computerChoice == 0 && userChoice == 2) || 
                   (computerChoice == 1 && userChoice == 0) || 
                   (computerChoice == 2 && userChoice == 1)) {
            System.out.println("\nComputer wins!");
        } else {
            System.out.println("\nYou win!");
        }

        // Close the scanner
        scanner.close();
    }
}
