package Items;


public class DrumStick extends Item {

    private String brand;

    public DrumStick(double buyPrice, double sellPrice, ItemType itemType, String brand) {
        super(buyPrice, sellPrice, itemType);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}
