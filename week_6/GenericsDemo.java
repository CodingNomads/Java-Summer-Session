package week_6;

import java.util.ArrayList;

public class GenericsDemo {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.add("Hello!");

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(3);

        ArrayList<Student> students = new ArrayList<>();
        Student s = new Student();
        s.name = "Ryan";
        s.email = "ryan@codingnomads.com";
        s.gpa = 3.9;
        students.add(s);

    }

}
