package level1;

import java.util.Scanner;
class Item{
    int itemCode;
    String itemName;
    double price;
    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }
    public void display_details(int q){
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Item Price: " + price);
        System.out.println("Quantity: " + q);
        System.out.println("Total Price: " + q * price);
    }
}

public class Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int code = scanner.nextInt();
        String title = scanner.next();
        double price = scanner.nextDouble();
        int quantity = scanner.nextInt();
        Item item = new Item(code, title, price);
        item.display_details(quantity);
    }

}
