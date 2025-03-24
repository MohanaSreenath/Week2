package level1;

import java.util.Scanner;

class Book {
    String title;
    String author;
    double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class Book_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter title:");
        String title = sc.nextLine();
        System.out.println("Enter author:");
        String author = sc.nextLine();
        System.out.println("Enter price:");
        double price = sc.nextDouble();

        Book book = new Book(title, author, price);

        book.displayDetails();

        sc.close();
    }
}
