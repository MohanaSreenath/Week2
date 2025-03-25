package Level2;

public class Course {
    private String courseName;
    private int duration;
    private double fee;
    private static String instituteName;

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: $" + fee);
        System.out.println("Institute Name: " + instituteName);
    }

    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

    public static void main(String[] args) {
        updateInstituteName("Bridgelabz Institute");

        Course course1 = new Course("Java Programming", 6, 500.0);
        Course course2 = new Course("Python Programming", 4, 400.0);

        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();
    }
}