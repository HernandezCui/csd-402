import java.util.ArrayList;
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        // Create and populate an ArrayList with at least 10 Strings
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Apple");
        strings.add("Banana");
        strings.add("Cherry");
        strings.add("Date");
        strings.add("Elderberry");
        strings.add("Fig");
        strings.add("Grape");
        strings.add("Honeydew");
        strings.add("Kiwi");
        strings.add("Lemon");

        // for-each loop to print the ArrayList
        System.out.println("The ArrayList contains:");
        for (String fruit : strings) {
            System.out.println(fruit);
        }

       // Ask the user which element they want to see again
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the index of the element you want to see again (0-9):");
        int index;

        // try/catch to handle potential exceptions
        try {
            index = Integer.parseInt(scanner.nextLine()); // Auto-unboxing example
            System.out.println("You selected: " + strings.get(index));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception: Out of Bounds");
        } catch (NumberFormatException e) {
            System.out.println("Exception: Invalid input. Please enter a number.");
        }
    }
}