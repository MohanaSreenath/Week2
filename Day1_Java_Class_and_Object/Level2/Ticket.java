package level2;

import java.util.Scanner;

class Movieticket{
    String moviename;
    String seatnumber;
    Double price;
    Movieticket(String moviename, String seatnumber, Double price) {
        this.moviename = moviename;
        this.seatnumber = seatnumber;
        this.price = price;
    }
    public void book_ticket(){
        System.out.println("Your Ticket Details");
        System.out.println("Movie Name: " + moviename);
        System.out.println("Seat Number: " + seatnumber);
        System.out.println("Price: " + price);
    }
}
public class Ticket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the movie name: ");
        String moviename = sc.nextLine();
        System.out.println("Enter the seat number: ");
        String seatnumber = sc.nextLine();
        System.out.println("Enter the price: ");
        Double price = sc.nextDouble();
        Movieticket m = new Movieticket(moviename, seatnumber, price);
        m.book_ticket();
    }
}
