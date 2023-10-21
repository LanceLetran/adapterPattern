package adapterPattern;

// Adapter for Laptop to PowerOutlet
public class LaptopAdapter implements PowerOutlet {
    private final Laptop laptop;

    public LaptopAdapter(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public String plugIn() {
        return laptop.charge();
    }
}
