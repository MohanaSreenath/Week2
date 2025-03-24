package level2;

import java.util.Scanner;

class Student{
    String name;
    int roll;
    int marks;
    public Student(String name, int roll, int marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }
    public void display(String Grade) {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: "+Grade);
    }
    public String grade(int marks) {
        if (marks >= 100) {
            return "A+";
        }
        if (marks >= 90) {
            return "A";
        }
        if (marks >= 80) {

        }
        if (marks >= 70) {
            return "B+";
        }
        if (marks >= 60) {

        }
        if (marks >= 50) {

        }
        if (marks >= 40) {
            return "C+";
        }
        if (marks >= 30) {
            return "C";
        }
    return "Fail you baka";
    }
}
public class Marks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student name: ");
        String name = scanner.nextLine();
        System.out.println("Enter student roll: ");
        int roll = scanner.nextInt();
        System.out.println("Enter student marks: ");
        int marks = scanner.nextInt();
        Student student = new Student(name, roll, marks);
        student.display(student.grade(marks));

    }
}
