abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public String getItemDetails() {
        return "ID: " + itemId + ", Title: " + title + ", Author: " + author;
    }

    public abstract int getLoanDuration();
}

interface Reservable {
    void reserveItem(String borrower);
    boolean checkAvailability();
}

class Book extends LibraryItem implements Reservable {
    private boolean isAvailable = true;
    private String borrower;

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14;
    }

    @Override
    public void reserveItem(String borrower) {
        if (isAvailable) {
            this.borrower = borrower;
            isAvailable = false;
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}

class Magazine extends LibraryItem implements Reservable {
    private boolean isAvailable = true;
    private String borrower;

    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7;
    }

    @Override
    public void reserveItem(String borrower) {
        if (isAvailable) {
            this.borrower = borrower;
            isAvailable = false;
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}

class DVD extends LibraryItem implements Reservable {
    private boolean isAvailable = true;
    private String borrower;

    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3;
    }

    @Override
    public void reserveItem(String borrower) {
        if (isAvailable) {
            this.borrower = borrower;
            isAvailable = false;
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}

public class Library {
    public static void main(String[] args) {
        LibraryItem book = new Book("B001", "Java Programming", "Author A");
        LibraryItem magazine = new Magazine("M001", "Tech Today", "Author B");
        LibraryItem dvd = new DVD("D001", "Inception", "Director C");

        System.out.println(book.getItemDetails());
        System.out.println("Loan Duration: " + book.getLoanDuration() + " days");

        System.out.println(magazine.getItemDetails());
        System.out.println("Loan Duration: " + magazine.getLoanDuration() + " days");

        System.out.println(dvd.getItemDetails());
        System.out.println("Loan Duration: " + dvd.getLoanDuration() + " days");

        Reservable reservableBook = (Reservable) book;
        reservableBook.reserveItem("John Doe");
        System.out.println("Book available: " + reservableBook.checkAvailability());
    }
}