package Week2.Day4_OOps_design;
//package Collections;

import java.util.ArrayList;
import java.util.List;

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

class Department {
    private String name;
    private List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public String toString() {
        return name + " Employees: " + employees;
    }
}

class Company {
    private String name;
    private List<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void displayCompanyDetails() {
        System.out.println("Company: " + name);
        for (Department department : departments) {
            System.out.println(department);
        }
    }
}

public class CompanyComposition {
    public static void main(String[] args) {
        Company company = new Company("TechCorp");

        Department dev = new Department("Development");
        Department hr = new Department("HR");

        dev.addEmployee(new Employee("Alice"));
        dev.addEmployee(new Employee("Bob"));
        hr.addEmployee(new Employee("Charlie"));

        company.addDepartment(dev);
        company.addDepartment(hr);

        company.displayCompanyDetails();
    }
}
