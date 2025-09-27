class Vehicle {
    protected String name;
    public Vehicle(String name) { this.name = name; }
    public void dispatch() { System.out.println(name + " is moving."); }
}

class Bus extends Vehicle {
    public Bus(String name) { super(name); }
    @Override
    public void dispatch() { System.out.println(name + " is running on a fixed route."); }
}

class Taxi extends Vehicle {
    public Taxi(String name) { super(name); }
    @Override
    public void dispatch() { System.out.println(name + " is providing door-to-door service."); }
}

class Train extends Vehicle {
    public Train(String name) { super(name); }
    @Override
    public void dispatch() { System.out.println(name + " is following a schedule with multiple carriages."); }
}

class Bike extends Vehicle {
    public Bike(String name) { super(name); }
    @Override
    public void dispatch() { System.out.println(name + " is available for short eco-friendly trips."); }
}

public class FleetManagement {
    public static void main(String[] args) {
        Vehicle[] fleet = {
            new Bus("City Bus"),
            new Taxi("Yellow Cab"),
            new Train("Express Train"),
            new Bike("E-Bike")
        };

        for (Vehicle v : fleet) {
            v.dispatch(); // Executes based on actual object type
        }
    }
}
