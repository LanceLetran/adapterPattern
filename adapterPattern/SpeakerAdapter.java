package adapterPattern;

// Adapter for Speaker to RemoteControllerFunction
public class SpeakerAdapter implements RemoteControllerFunction {
    private final Speaker speaker;

    public SpeakerAdapter(Speaker speaker) {
        this.speaker = speaker;
    }

    @Override
    public String powerOn() {
        return speaker.turnOn();
    }

    @Override
    public String powerOff() {
        return speaker.turnOff();
    }

    @Override
    public String increaseSetting() {
        return speaker.volumeUp();
    }

    @Override
    public String decreaseSetting() {
        return speaker.volumeDown();
    }
}
