package Level1;

class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    // Default constructor
    public HotelBooking() {
        this.guestName = "Unknown";
        this.roomType = "Standard";
        this.nights = 1;
    }

    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    // Method to display booking details
    public void displayBookingDetails() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        // Using default constructor
        HotelBooking defaultBooking = new HotelBooking();
        System.out.println("Default Booking:");
        defaultBooking.displayBookingDetails();

        // Using parameterized constructor
        HotelBooking paramBooking = new HotelBooking("John Doe", "Deluxe", 3);
        System.out.println("Parameterized Booking:");
        paramBooking.displayBookingDetails();

        // Using copy constructor
        HotelBooking copyBooking = new HotelBooking(paramBooking);
        System.out.println("Copy Booking:");
        copyBooking.displayBookingDetails();
    }
}