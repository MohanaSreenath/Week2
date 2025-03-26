package Week2.Day4_OOps_design;

import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return name + " ($" + price + ")";
    }
}

class Order {
    private Customer customer;
    private List<Product> products;

    public Order(Customer customer) {
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayOrderDetails() {
        System.out.println("Order for: " + customer);
        System.out.println("Products: " + products);
    }
}

class Customer {
    private String name;
    private List<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public void placeOrder(Order order) {
        orders.add(order);
    }

    public void displayOrders() {
        System.out.println("Customer: " + name + " Orders: " + orders);
    }

    public String toString() {
        return name;
    }
}

public class EcommercePlatform {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        Product product1 = new Product("Laptop", 1200);
        Product product2 = new Product("Phone", 800);
        Product product3 = new Product("Headphones", 100);

        Order order1 = new Order(customer1);
        order1.addProduct(product1);
        order1.addProduct(product2);

        Order order2 = new Order(customer2);
        order2.addProduct(product3);

        customer1.placeOrder(order1);
        customer2.placeOrder(order2);

        order1.displayOrderDetails();
        order2.displayOrderDetails();
        customer1.displayOrders();
        customer2.displayOrders();
    }
}
