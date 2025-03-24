package level1;
class Employee{
    String name = "Ryuji Kazutora";
    int id = 2134;
    double salary = 10000.0;
public String get_name(){
    return name;
}
public int get_id(){
    return id;
}
public double get_salary(){
    return salary;
}
}
public class Emp {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        String name = e1.get_name();
        int id = e1.get_id();
        double salary = e1.get_salary();
        System.out.println(name + " " + id + " " + salary);
    }

}
