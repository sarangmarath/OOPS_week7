class SmartDevice {
    protected String name;
    public SmartDevice(String name) { this.name = name; }
    public void status() { System.out.println(name + " status OK"); }
}

class SmartClassroom extends SmartDevice {
    public SmartClassroom(String name) { super(name); }
    public void controlProjector() { System.out.println(name + " projector turned ON"); }
}

class SmartLab extends SmartDevice {
    public SmartLab(String name) { super(name); }
    public void checkEquipment() { System.out.println(name + " equipment checked"); }
}

class SmartLibrary extends SmartDevice {
    public SmartLibrary(String name) { super(name); }
    public void trackOccupancy() { System.out.println(name + " occupancy tracked"); }
}

public class CampusIoT {
    public static void main(String[] args) {
        SmartDevice[] devices = {
            new SmartClassroom("Room 101"),
            new SmartLab("Chem Lab"),
            new SmartLibrary("Main Library")
        };

        for (SmartDevice d : devices) {
            d.status();
            if (d instanceof SmartClassroom) ((SmartClassroom) d).controlProjector();
            if (d instanceof SmartLab) ((SmartLab) d).checkEquipment();
            if (d instanceof SmartLibrary) ((SmartLibrary) d).trackOccupancy();
        }
    }
}

