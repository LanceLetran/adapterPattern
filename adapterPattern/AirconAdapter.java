package adapterPattern;

// Adapter for AirCon to RemoteControllerFunction
public class AirconAdapter implements RemoteControllerFunction {
    private final AirCon airCon;

    public AirconAdapter(AirCon airCon) {
        this.airCon = airCon;
    }

    @Override
    public String powerOn() {
        return airCon.turnOn();
    }

    @Override
    public String powerOff() {
        return airCon.turnOff();
    }

    @Override
    public String increaseSetting() {
        return airCon.increaseTemperature();
    }

    @Override
    public String decreaseSetting() {
        return airCon.decreaseTemperature();
    }
}
