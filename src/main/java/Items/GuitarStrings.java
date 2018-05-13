package Items;

     public class GuitarStrings extends Item {

         private String brand;

        public GuitarStrings(double buyPrice, double sellPrice, ItemType itemType, String brand) {
            super(buyPrice, sellPrice, itemType);
            this.brand = brand;
        }

        public String getBrand() {
            return brand;
        }
}
