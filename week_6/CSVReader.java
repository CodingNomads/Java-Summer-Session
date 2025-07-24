package week_6;

import java.io.*;
import java.util.ArrayList;

public class CSVReader {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        ArrayList<String> badData = new ArrayList<>();
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(
                    new FileReader("week_6/students.csv"));
            String line = "";
            while ((line = reader.readLine()) != null) {
                // print out the line that was just read
                String[] values = line.split(",");
                Student student = new Student();
                student.name = values[0];
                student.email = values[1];
                double gpa = 0.0;
                try {
                    gpa = Double.parseDouble(values[2]);
                    student.gpa = gpa;
                } catch(Exception nfe){
                    System.out.println("skipping row due to bad data");
                    System.out.println("row data: " + student.name + " " + student.email);
                    badData.add(line);
                    continue;
                }
                students.add(student);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        double gpaSum = 0;
        double avg = 0;
        for(Student s : students){
            gpaSum += s.gpa;
        }

        avg = gpaSum / students.size();
        System.out.println("average GPA is: " + avg);

        if (!badData.isEmpty()){

            try (FileWriter writer = new FileWriter("week_6/bad_data.txt")) {
               for(String s : badData) {
                   writer.write(s);
               }
            } catch (IOException e) {
                System.out.println("trouble writing bad data");
            }
        }
    }

}
