public class NumberPattern {
    
    public static void main(String[] args) {
        // Loop through the rows 
        for (int row = 0; row < 7; row++) {
            // Print leading spaces for each row
            for (int space = 0; space < 6 - row; space++) {
                System.out.print(" ");
            }

            // Print the numbers in increasing order (powers of 2)
            int num = 1;
            for (int col = 0; col <= row; col++) {
                System.out.print(num + " ");
                num *= 2; // Multiply the number by 2 (powers of 2)
            }

            // Print the numbers in decreasing order (powers of 2)
            num /= 4; 
            for (int col = 0; col < row; col++) {
                num /= 2; // Divide by 2 for decreasing part
                System.out.print(num + " ");
            }

            // Print the "@" symbol at the end of each row
            System.out.print("@");

            // Move to the next line for the next row
            System.out.println();
        }
    }
}
