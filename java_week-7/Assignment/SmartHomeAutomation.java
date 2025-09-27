class SmartDevice {
    protected String name;
    public SmartDevice(String name) { this.name = name; }
    public void status() { System.out.println(name + " is operational."); }
}

class SmartTV extends SmartDevice {
    public SmartTV(String name) { super(name); }
    public void changeChannel(int ch) { System.out.println(name + " switched to channel " + ch); }
}

class SmartThermostat extends SmartDevice {
    public SmartThermostat(String name) { super(name); }
    public void setTemperature(int temp) { System.out.println(name + " temperature set to " + temp + "°C"); }
}

public class SmartHomeAutomation {
    public static void main(String[] args) {
        SmartDevice[] devices = {
            new SmartTV("Living Room TV"),
            new SmartThermostat("Bedroom Thermostat")
        };

        for (SmartDevice d : devices) {
            d.status();
            if (d instanceof SmartTV) ((SmartTV) d).changeChannel(5);
            if (d instanceof SmartThermostat) ((SmartThermostat) d).setTemperature(22);
        }
    }
}
