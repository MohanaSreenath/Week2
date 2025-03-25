package Level2;

public class Book {
    public String ISBN;
    protected String title;
    private String author;

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public static void main(String[] args) {
        Book book = new Book();
        book.ISBN = "123456789";
        book.title = "Java Programming";
        book.setAuthor("John Doe");

        EBook ebook = new EBook();
        ebook.ISBN = "987654321";
        ebook.title = "Advanced Java";
        ebook.displayDetails();
    }
}

class EBook extends Book {
    public void displayDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
    }
}