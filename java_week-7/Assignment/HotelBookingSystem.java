class HotelBooking {

    // Standard booking
    public void bookRoom(String roomType, int nights) {
        double cost = nights * 100;
        System.out.println("Standard Booking: " + roomType + ", Nights: " + nights + ", Cost: $" + cost);
    }

    // Seasonal booking
    public void bookRoom(String roomType, int nights, double seasonalMultiplier) {
        double cost = nights * 100 * seasonalMultiplier;
        System.out.println("Seasonal Booking: " + roomType + ", Nights: " + nights + ", Multiplier: " + seasonalMultiplier + ", Cost: $" + cost);
    }

    // Corporate booking
    public void bookRoom(String roomType, int nights, double corporateDiscount, boolean mealPackage) {
        double cost = nights * 100;
        cost -= corporateDiscount;
        if (mealPackage) cost += 50;
        System.out.println("Corporate Booking: " + roomType + ", Nights: " + nights + ", Discount: $" + corporateDiscount + ", Meal Package: " + mealPackage + ", Total Cost: $" + cost);
    }

    // Wedding package
    public void bookRoom(String roomType, int nights, int guests, double decorationFee, boolean catering) {
        double cost = nights * 100 + guests * 20 + decorationFee;
        if (catering) cost += 100;
        System.out.println("Wedding Package: " + roomType + ", Nights: " + nights + ", Guests: " + guests + ", Decoration: $" + decorationFee + ", Catering: " + catering + ", Total Cost: $" + cost);
    }
}

public class HotelBookingSystem {
    public static void main(String[] args) {
        HotelBooking hb = new HotelBooking();
        hb.bookRoom("Deluxe", 3);
        hb.bookRoom("Deluxe", 3, 1.5);
        hb.bookRoom("Deluxe", 3, 30, true);
        hb.bookRoom("Deluxe", 3, 50, 200, true);
    }
}
