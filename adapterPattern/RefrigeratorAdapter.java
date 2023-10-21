package adapterPattern;

// Adapter for Refrigerator to PowerOutlet
public class RefrigeratorAdapter implements PowerOutlet {
    private final Refrigerator refrigerator;

    public RefrigeratorAdapter(Refrigerator refrigerator) {
        this.refrigerator = refrigerator;
    }

    @Override
    public String plugIn() {
        return refrigerator.startCooling();
    }
}
