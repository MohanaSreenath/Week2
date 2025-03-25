package Level1;

class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private static final int COST_PER_DAY = 50;

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public int calculateTotalCost() {
        return rentalDays * COST_PER_DAY;
    }

    public void displayRentalDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: $" + calculateTotalCost());
    }

    public static void main(String[] args) {
        CarRental rental = new CarRental("John Doe", "Toyota Camry", 5);
        rental.displayRentalDetails();
    }
}