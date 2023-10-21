package adapterPattern;

// Speaker class
public class Speaker {
    public String turnOn() {
        return "Bluetooth speaker is on.";
    }

    public String turnOff() {
        return "Bluetooth speaker is off.";
    }

    public String volumeUp() {
        return "Bluetooth speaker volume is increasing.";
    }

    public String volumeDown() {
        return "Bluetooth speaker volume is decreasing.";
    }
}
