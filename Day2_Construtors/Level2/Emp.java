package Level2;

class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void modifySalary(double newSalary) {
        this.salary = newSalary;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
    }
}

public class Emp {
    public static void main(String[] args) {
        Employee emp = new Employee(101, "IT", 50000);
        emp.modifySalary(55000);
        System.out.println("Updated Salary: " + emp.getSalary());

        Manager mgr = new Manager(102, "HR", 70000);
        mgr.displayDetails();
        mgr.modifySalary(75000);
        System.out.println("Updated Salary: " + mgr.getSalary());
    }
}