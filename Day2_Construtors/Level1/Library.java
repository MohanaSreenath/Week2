package Level1;

class Book {
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    public Book(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public boolean borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            return true;
        }
        return false;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("The Alchemist", "Paulo Coelho", 299.99, true);
        Book book2 = new Book("1984", "George Orwell", 199.99, true);

        if (book1.borrowBook()) {
            System.out.println("You borrowed: " + book1.getTitle());
        } else {
            System.out.println(book1.getTitle() + " is not available.");
        }

        if (book2.borrowBook()) {
            System.out.println("You borrowed: " + book2.getTitle());
        } else {
            System.out.println(book2.getTitle() + " is not available.");
        }
    }
}