package adapterPattern;

// Interface for remote controller functions
public interface RemoteControllerFunction {
    String powerOn();
    String powerOff();
    String increaseSetting();
    String decreaseSetting();
}
