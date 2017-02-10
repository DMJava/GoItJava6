package core.dima.practice.module03;

import java.util.Date;

public class Solution {
    public static void main(String[] args) {

        Date date = new Date();

        Course[] coursesTaken = new Course[5];

        Course course = new Course(date, "Oleg");
        Course course1 = new Course("Valera", 8, "Anna");
        Course course2 = new Course(date, "Victor");
        Course course3 = new Course("Irina", 6, "MA");
        Course course4 = new Course("Igor", 7, "TG");

        coursesTaken[0] = course;
        coursesTaken[1] = course1;
        coursesTaken[2] = course2;
        coursesTaken[3] = course3;
        coursesTaken[4] = course4;

        SpecialStudent specialStudent = new SpecialStudent("Egor", coursesTaken, 45986865);

        Student student = new Student("A", "B", 9);
        Student student1 = new Student("ZZ", coursesTaken);
        Student student2 = new Student("PP", coursesTaken);
        Student student3 = new Student("OO", "KK", 18);

        CollegeStudent collegeStudent = new CollegeStudent("YAYA", "Toure", 4);
        CollegeStudent collegeStudent2 = new CollegeStudent("Kotov",coursesTaken);
        CollegeStudent collegeStudent3 = new CollegeStudent("Enotov",coursesTaken,"Univer", 25, 456321987);
    }
}