package adapterPattern;

// Adapter for Tv to RemoteControllerFunction
public class TvAdapter implements RemoteControllerFunction {
    private final Tv tv;

    public TvAdapter(Tv tv) {
        this.tv = tv;
    }

    @Override
    public String powerOn() {
        return tv.turnOn();
    }

    @Override
    public String powerOff() {
        return tv.turnOff();
    }

    @Override
    public String increaseSetting() {
        return tv.volumeUp();
    }

    @Override
    public String decreaseSetting() {
        return tv.volumeDown();
    }
}
