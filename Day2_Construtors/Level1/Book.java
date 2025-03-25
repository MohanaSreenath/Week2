package Level1;

import java.util.Scanner;

class Books{
    String name;
    String author;
    double price;
    public Books(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}
public class Book {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Books book = new Books(scanner.nextLine(), scanner.nextLine(), scanner.nextDouble());
        book.display();
    }

}
