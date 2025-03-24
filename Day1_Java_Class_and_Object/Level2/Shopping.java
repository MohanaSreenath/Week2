import java.util.ArrayList;
import java.util.List;

class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    double getTotalPrice() {
        return price * quantity;
    }
}

class ShoppingCart {
    List<CartItem> cartItems = new ArrayList<>();

    void addItem(String itemName, double price, int quantity) {
        cartItems.add(new CartItem(itemName, price, quantity));
    }

    void removeItem(String itemName) {
        cartItems.removeIf(item -> item.itemName.equals(itemName));
    }

    double getTotalCost() {
        return cartItems.stream().mapToDouble(item -> item.getTotalPrice()).sum();
    }
}

public class Shopping {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Apple", 1.5, 4);
        cart.addItem("Banana", 0.8, 6);
        System.out.println("Total Cost: " + cart.getTotalCost());
        cart.removeItem("Apple");
        System.out.println("Total Cost after removing Apple: " + cart.getTotalCost());
    }
}
