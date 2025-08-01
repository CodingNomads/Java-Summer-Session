package week_6.generics;

import java.util.ArrayList;

public class GenericsDemo {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.add("Hello!");

        // won't work
        // words.add(8);

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(3);

        ArrayList<Student> students = new ArrayList<>();
        Student s = new Student();
        s.name = "Ryan";
        s.email = "ryan@codingnomads.com";
        s.gpa = 3.9;
        students.add(s);

        CustomGeneric<String> g1 = new CustomGeneric<>("String");
        String str = g1.getVal();
        System.out.println(str);
        g1.setVal("String2");
        System.out.println(g1.getVal());

        CustomGeneric<Integer> g2 = new CustomGeneric<>(89);
        int num = g2.getVal();
        System.out.println(num);
        g2.setVal(90);
        System.out.println(str);

    }
}
