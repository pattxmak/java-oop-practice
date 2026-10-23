package interfaces;

public class SmartSpeaker implements Switchable, Connectable{

    private String deviceName;
    private boolean isOn;
    private int volume;

    public SmartSpeaker(String deviceName, int volume) {

        if (deviceName == null || deviceName.isBlank()) {
            throw new IllegalArgumentException("Device Name is blank");
        }

        this.deviceName = deviceName;
        this.isOn = false;
        setVolume(volume);
    }

    @Override
    public void connectToWifi(String wifiName) {
        if (wifiName == null || wifiName.isBlank()) {
            throw new IllegalArgumentException("WiFi Name cannot be blank");
        }

        System.out.println("Smart Speaker " + deviceName + "connect wife " + wifiName);
    }

    @Override
    public void turnOn() {
        if (isOn) {
            System.out.println("Smart speaker already turn on!");
            return;
        }

        this.isOn = true;
        System.out.println("Smart speaker " + deviceName + "is on.");
    }

    @Override
    public void turnOff() {
        if (isOn) {
            System.out.println("Smart speaker already turn off!");
            return;
        }

        this.isOn = true;
        System.out.println("Smart speaker " + deviceName + "is off.");
    }

    public void setVolume(int volume) {

        if (volume < 0 || volume > 100) {
            throw new IllegalArgumentException("Volume must be 0 to 100");
        }

        this.volume = volume;
        System.out.println("Smart Speaker " + deviceName + " set volume to " + volume);
    }
}
