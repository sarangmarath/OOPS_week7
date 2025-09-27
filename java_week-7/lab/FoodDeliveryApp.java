class DeliverySystem {

    // Basic delivery: distance only
    public void calculateDelivery(double distance) {
        double cost = distance * 5;
        System.out.println("Basic Delivery: Distance " + distance + " km, Cost = $" + cost);
    }

    // Premium delivery: distance + priority fee
    public void calculateDelivery(double distance, double priorityFee) {
        double cost = distance * 5 + priorityFee;
        System.out.println("Premium Delivery: Distance " + distance + " km, Priority Fee $" + priorityFee + ", Total Cost = $" + cost);
    }

    // Group delivery: distance + number of orders discount
    public void calculateDelivery(double distance, int orders) {
        double baseCost = distance * 5;
        double discount = orders * 2;
        double total = baseCost - discount;
        System.out.println("Group Delivery: Distance " + distance + " km, Orders " + orders + ", Discount $" + discount + ", Total Cost = $" + total);
    }

    // Festival special: distance + discount % + free delivery threshold
    public void calculateDelivery(double distance, double discountPercent, double freeDeliveryThreshold) {
        double baseCost = distance * 5;
        double discount = baseCost * (discountPercent / 100);
        double total = baseCost - discount;
        if (total > freeDeliveryThreshold) {
            total = 0;
            System.out.println("Festival Special: Distance " + distance + " km, Eligible for FREE Delivery!");
        } else {
            System.out.println("Festival Special: Distance " + distance + " km, Discount " + discountPercent + "%, Total Cost = $" + total);
        }
    }
}

public class FoodDeliveryApp {
    public static void main(String[] args) {
        DeliverySystem ds = new DeliverySystem();
        ds.calculateDelivery(10);                    // Basic
        ds.calculateDelivery(10, 15);                // Premium
        ds.calculateDelivery(10, 3);                 // Group
        ds.calculateDelivery(10, 20, 40);            // Festival special
    }
}
