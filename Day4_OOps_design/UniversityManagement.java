package Week2.Day4_OOps_design;

import java.util.ArrayList;
import java.util.List;

class Course {
    private String name;
    private Professor professor;
    private List<Student> students;

    public Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    public void enrollStudent(Student student) {
        students.add(student);
        student.addCourse(this);
    }

    public String toString() {
        return name + " Taught by: " + professor;
    }

    public void displayEnrolledStudents() {
        System.out.println("Course: " + name + " Students: " + students);
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

class Professor {
    private String name;

    public Professor(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

class University {
    private String name;
    private List<Professor> professors;
    private List<Course> courses;

    public University(String name) {
        this.name = name;
        this.professors = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    public void addProfessor(Professor professor) {
        professors.add(professor);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void displayUniversityDetails() {
        System.out.println("University: " + name);
        for (Course course : courses) {
            course.displayEnrolledStudents();
        }
    }
}

public class UniversityManagement {
    public static void main(String[] args) {
        University university = new University("Tech University");

        Professor professor1 = new Professor("Dr. Smith");
        Professor professor2 = new Professor("Prof. Johnson");

        university.addProfessor(professor1);
        university.addProfessor(professor2);

        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        Course course1 = new Course("Computer Science");
        Course course2 = new Course("Mathematics");

        course1.assignProfessor(professor1);
        course2.assignProfessor(professor2);

        course1.enrollStudent(student1);
        course1.enrollStudent(student2);
        course2.enrollStudent(student1);

        university.addCourse(course1);
        university.addCourse(course2);

        university.displayUniversityDetails();
        student1.displayCourses();
        student2.displayCourses();
    }
}
