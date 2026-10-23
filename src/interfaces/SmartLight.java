package interfaces;

public class SmartLight implements Connectable, Switchable {

    private String deviceName;
    private boolean isOn;

    public SmartLight(String deviceName) {

        if (deviceName == null || deviceName.isBlank()) {
            throw new IllegalArgumentException("Device Name is blank");
        }

        this.deviceName = deviceName;
        this.isOn = false;
    }

    @Override
    public void turnOn() {
        if (isOn) {
            System.out.println("Device already turn on!");
            return;
        }

        this.isOn = true;
        System.out.println("Smart Light " + deviceName + "is on.");
    }

    @Override
    public void turnOff() {
        if (!isOn) {
            System.out.println("Device already turn off!");
            return;
        }

        this.isOn = false;
        System.out.println("Smart Light " + deviceName + "is off.");
    }

    @Override
    public void connectToWifi(String wifiName) {

        if (wifiName == null || wifiName.isBlank()) {
            throw new IllegalArgumentException("WiFi Name cannot be blank");
        }

        System.out.println("Smart Light " + deviceName + "connect wife " + wifiName);

    }
}
