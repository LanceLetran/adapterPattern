package adapterPattern;

// Air conditioning class
public class AirCon {
    public String turnOn() {
        return "Aircon is initializing cooling stage!";
    }

    public String turnOff() {
        return "Aircon is shutting down.";
    }

    public String increaseTemperature() {
        return "Aircon is heating up the room.";
    }

    public String decreaseTemperature() {
        return "Aircon is cooling down the room.";
    }
}
