package week_6.IO;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFile {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("week_6/IO/itsworking.txt"))) {
            String line;
            while ((line = reader.readLine()) != null)
                System.out.println(line);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}