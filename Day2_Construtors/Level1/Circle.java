package Level1;

//import java.awt.geom.Area;
import java.util.Scanner;
class Area{
    double area;
    public Area(double radius){
        this.area = 3.14 * radius * radius;
    }
    public void display(){
        System.out.println("Area: " + area);
    }
}
public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        Area area = new Area(radius);
        area.display();
    }
}
