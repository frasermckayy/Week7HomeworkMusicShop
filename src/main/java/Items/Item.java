package Items;

import behaviours.ISell;

public class Item implements ISell {

    private double buyPrice;
    private double sellPrice;
    private ItemType itemType;


    public Item(double buyPrice, double sellPrice, ItemType itemType){
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.itemType = itemType;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public double calculateMarkup(){
        return this.sellPrice - this.buyPrice;
    }
}


