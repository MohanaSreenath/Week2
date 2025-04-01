abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemDetails() {
        return "Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public abstract double calculateTotalPrice();
}

class VegItem extends FoodItem {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }
}

class NonVegItem extends FoodItem {
    private static final double ADDITIONAL_CHARGE = 50;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + ADDITIONAL_CHARGE;
    }
}

interface Discountable {
    void applyDiscount(double discountPercentage);
    String getDiscountDetails();
}

class Order implements Discountable {
    private FoodItem foodItem;
    private double discount;

    public Order(FoodItem foodItem) {
        this.foodItem = foodItem;
    }

    @Override
    public void applyDiscount(double discountPercentage) {
        discount = foodItem.calculateTotalPrice() * (discountPercentage / 100);
    }

    @Override
    public String getDiscountDetails() {
        return "Discount Applied: " + discount;
    }

    public double getFinalPrice() {
        return foodItem.calculateTotalPrice() - discount;
    }

    public String getOrderDetails() {
        return foodItem.getItemDetails() + ", Final Price: " + getFinalPrice();
    }
}

public class Food {
    public static void main(String[] args) {
        FoodItem vegItem = new VegItem("Paneer Butter Masala", 200, 2);
        FoodItem nonVegItem = new NonVegItem("Chicken Biryani", 300, 1);

        Order vegOrder = new Order(vegItem);
        vegOrder.applyDiscount(10);

        Order nonVegOrder = new Order(nonVegItem);
        nonVegOrder.applyDiscount(5);

        System.out.println(vegOrder.getOrderDetails());
        System.out.println(nonVegOrder.getOrderDetails());
    }
}