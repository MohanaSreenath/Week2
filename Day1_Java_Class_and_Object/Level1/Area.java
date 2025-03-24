package level1;
import java.util.Scanner;
class Circle{
    int radius;
    public Circle(int radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
public class Area {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the radius of the circle: ");
int radius = scanner.nextInt();
Circle circle = new Circle(radius);
System.out.println(circle.getArea());
}
}
