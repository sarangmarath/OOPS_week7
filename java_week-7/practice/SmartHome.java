class SmartDevice {
    protected String deviceName;

    public SmartDevice(String deviceName) { this.deviceName = deviceName; }

    public void turnOn() { System.out.println(deviceName + " is turned ON"); }
    public void turnOff() { System.out.println(deviceName + " is turned OFF"); }
}

class SmartLight extends SmartDevice {
    public SmartLight(String deviceName) { super(deviceName); }

    public void setBrightness(int level) {
        System.out.println(deviceName + " brightness set to " + level + "%");
    }
}

class SmartThermostat extends SmartDevice {
    public SmartThermostat(String deviceName) { super(deviceName); }

    public void setTemperature(int temp) {
        System.out.println(deviceName + " temperature set to " + temp + "°C");
    }
}

public class SmartHome {
    public static void main(String[] args) {
        SmartDevice device1 = new SmartLight("Living Room Light");
        SmartDevice device2 = new SmartThermostat("Hall Thermostat");

        device1.turnOn();
        device2.turnOn();

        // Safe downcasting
        if (device1 instanceof SmartLight) {
            SmartLight light = (SmartLight) device1;
            light.setBrightness(75);
        }

        if (device2 instanceof SmartThermostat) {
            SmartThermostat thermostat = (SmartThermostat) device2;
            thermostat.setTemperature(22);
        }
    }
}
