class Device {
    String deviceId;
    String status;

    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    public void displayStatus() {
        System.out.println("Device ID: " + deviceId + ", Status: " + status);
    }
}

class Thermostat extends Device {
    int temperatureSetting;

    public Thermostat(String deviceId, String status, int temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting);
    }
}

public class Smart {
    public static void main(String[] args) {
        Device device = new Device("D001", "ON");
        Thermostat thermostat = new Thermostat("T001", "OFF", 22);

        device.displayStatus();
        thermostat.displayStatus();
    }
}