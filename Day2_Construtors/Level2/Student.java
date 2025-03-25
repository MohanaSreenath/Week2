package Level2;

class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
}

class PostgraduateStudent extends Student {
    public void displayDetails() {
        System.out.println("Name: " + name);
    }
}

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student();
        student.rollNumber = 1;
        student.name = "John";
        student.setCGPA(9.8);
        System.out.println("Roll Number: " + student.rollNumber);
        System.out.println("CGPA: " + student.getCGPA());

        PostgraduateStudent pgStudent = new PostgraduateStudent();
        pgStudent.name = "ice-cream";
        pgStudent.displayDetails();
    }
}