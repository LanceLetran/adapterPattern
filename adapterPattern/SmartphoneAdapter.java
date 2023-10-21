package adapterPattern;

// Adapter for SmartphoneCharger to PowerOutlet
public class SmartphoneAdapter implements PowerOutlet {
    private final SmartphoneCharger smartphoneCharger;

    public SmartphoneAdapter(SmartphoneCharger smartphoneCharger) {
        this.smartphoneCharger = smartphoneCharger;
    }

    @Override
    public String plugIn() {
        return smartphoneCharger.chargePhone();
    }
}
