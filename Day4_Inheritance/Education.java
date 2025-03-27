public class Education {
    public static void main(String[] args) {
        PaidOnlineCourse paidCourse = new PaidOnlineCourse("Java Programming", 30, "Udemy", true, 5000, 10);
        System.out.println("Course Name: " + paidCourse.getCourseName());
        System.out.println("Duration: " + paidCourse.getDuration() + " days");
        System.out.println("Platform: " + paidCourse.getPlatform());
        System.out.println("Is Recorded: " + paidCourse.isRecorded());
        System.out.println("Fee: " + paidCourse.getFee());
        System.out.println("Discount: " + paidCourse.getDiscount() + "%");
    }
}

class Course {
    private String courseName;
    private int duration;

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getDuration() {
        return duration;
    }
}

class OnlineCourse extends Course {
    private String platform;
    private boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    public String getPlatform() {
        return platform;
    }

    public boolean isRecorded() {
        return isRecorded;
    }
}

class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount;

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    public double getFee() {
        return fee;
    }

    public double getDiscount() {
        return discount;
    }
}