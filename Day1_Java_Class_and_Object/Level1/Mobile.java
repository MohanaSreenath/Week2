package level1;

import java.util.Scanner;
class Mobile_Phone{
    String brand;
    String model;
    double price;
    public Mobile_Phone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    public void display(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}
public class Mobile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String brand = scanner.nextLine();
        String model = scanner.nextLine();
        double price = scanner.nextDouble();
        Mobile_Phone mobile = new Mobile_Phone(brand, model, price);
        mobile.display();

    }
}
