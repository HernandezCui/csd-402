import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        File file = new File("data.file");
        Random random = new Random();

        try {
            // Check if file exists, and create if it doesn't
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("File created: " + file.getName());
            }

            // 10 random numbers to the file
            FileWriter writer = new FileWriter(file, true);
            for (int i = 0; i < 10; i++) {
                writer.write(random.nextInt(100) + " "); // Write numbers separated by space
            }
            writer.close();
            System.out.println("10 random numbers written to the file.");

            // Read and display the contents of the file
            Scanner fileReader = new Scanner(file);
            System.out.println("Contents of the file:");
            while (fileReader.hasNext()) {
                System.out.print(fileReader.next() + " ");
            }
            fileReader.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
