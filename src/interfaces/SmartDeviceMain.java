package interfaces;

public class SmartDeviceMain {

    public static void main(String[] args) {

        SmartLight light = new SmartLight("Living room light");

        SmartSpeaker speaker = new SmartSpeaker("Kitchen Speaker", 30);

        light.connectToWifi("HomeWife");
        light.turnOff();
        light.turnOn();
        light.turnOn();
        light.turnOff();

        System.out.println();

        speaker.connectToWifi("HomeWifi");
        speaker.turnOff();
        speaker.turnOn();

        speaker.setVolume(60);
        speaker.setVolume(150); //throw

        speaker.turnOn();
        speaker.turnOff();

        Switchable[] switchableDevices = {light, speaker};
        for (Switchable device : switchableDevices) {
            device.turnOn();
        }
    }
}
