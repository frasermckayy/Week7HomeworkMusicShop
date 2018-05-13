package Shop;

import behaviours.ISell;

import java.util.ArrayList;

  public class ShopItems {

     private ArrayList<ISell> stock;

     public ShopItems() {
         this.stock = new ArrayList<>();
    }

     public int stockCount() {
        return stock.size();
    }

    public void addStock(ISell item) {
          this.stock.add(item);
      }

      public void removeStock(ISell item) {
          this.stock.remove(item);
      }

}
