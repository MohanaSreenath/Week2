package Week2.Day4_OOps_design;

import java.util.ArrayList;
import java.util.List;

class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

class Department {
    private String name;
    private List<Faculty> faculties;

    public Department(String name) {
        this.name = name;
        this.faculties = new ArrayList<>();
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public String toString() {
        return name + " Faculties: " + faculties;
    }
}

class University {
    private String name;
    private List<Department> departments;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void displayDetails() {
        System.out.println("University: " + name);
        for (Department department : departments) {
            System.out.println(department);
        }
    }
}

public class UniversityCompositionAggregation {
    public static void main(String[] args) {
        Faculty faculty1 = new Faculty("Dr. Smith");
        Faculty faculty2 = new Faculty("Prof. Johnson");

        Department cs = new Department("Computer Science");
        Department math = new Department("Mathematics");

        cs.addFaculty(faculty1);
        math.addFaculty(faculty2);

        University university = new University("Tech University");
        university.addDepartment(cs);
        university.addDepartment(math);

        university.displayDetails();
    }
}
