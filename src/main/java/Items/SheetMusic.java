package Items;

public class SheetMusic extends Item {

    private String brand;

    public SheetMusic(double buyPrice, double sellPrice, ItemType itemType, String brand) {
        super(buyPrice, sellPrice, itemType);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}
