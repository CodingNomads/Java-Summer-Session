package week_6;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteFile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("enter the directory to save the file in");
            String directory = scanner.nextLine();

            try (FileWriter writer = new FileWriter(directory)) {
                writer.write("Hello, file!");
                break;
            } catch (IOException e) {
                System.out.println("looks like that directory doesn't exist - try again");
            }
            // no finally block needed due to "try-with-resources" shown above

        } while (true);

        System.out.println("all done!");
    }
}