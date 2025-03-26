package Week2.Day4_OOps_design;

import java.util.ArrayList;
import java.util.List;

class Course {
    private String name;
    private List<Student> enrolledStudents;

    public Course(String name) {
        this.name = name;
        this.enrolledStudents = new ArrayList<>();
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
        student.addCourse(this);
    }

    public String toString() {
        return name;
    }

    public void displayEnrolledStudents() {
        System.out.println("Course: " + name + " Students: " + enrolledStudents);
    }
}

class Student {
    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void displayCourses() {
        System.out.println("Student: " + name + " Courses: " + courses);
    }

    public String toString() {
        return name;
    }
}

class School {
    private String name;
    private List<Student> students;

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayStudents() {
        System.out.println("School: " + name + " Students: " + students);
    }
}

public class SchoolAssociationAggregation {
    public static void main(String[] args) {
        School school = new School("Tech Academy");

        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        school.addStudent(student1);
        school.addStudent(student2);

        Course course1 = new Course("Math");
        Course course2 = new Course("Science");

        course1.enrollStudent(student1);
        course1.enrollStudent(student2);
        course2.enrollStudent(student1);

        school.displayStudents();
        student1.displayCourses();
        student2.displayCourses();
        course1.displayEnrolledStudents();
        course2.displayEnrolledStudents();
    }
}
