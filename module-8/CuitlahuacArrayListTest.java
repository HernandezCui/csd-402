import java.util.ArrayList;
import java.util.Scanner;

public class CuitlahuacArrayListTest {

   
    public static Integer max(ArrayList<Integer> list) {
        // Step 1: Check if the list is empty
        if (list.isEmpty()) {
            return 0;
        }

        // Step 2: Initialize maxValue with the first element
        int maxValue = list.get(0);

        // Step 3: Iterate through the list to find the maximum value
        for (int value : list) {
            if (value > maxValue) {
                maxValue = value;
            }
        }

        // Step 4: Return the maximum value
        return maxValue;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        // Step 5: Prompt the user for input
        System.out.println("Enter integers (enter 0 to stop):");

        while (true) {
            // Step 6: Read user input
            int input = scanner.nextInt();

            // Step 7: Add input to the ArrayList
            numbers.add(input);

            // Step 8: Stop input when 0 is entered
            if (input == 0) {
                break;
            }
        }

        // Step 9: Call the max method with the ArrayList
        Integer largestValue = max(numbers);

        // Step 10: Display the largest value
        System.out.println("The largest value in the ArrayList is: " + largestValue);

        // Step 11: Close the scanner
        scanner.close();
    }
}
