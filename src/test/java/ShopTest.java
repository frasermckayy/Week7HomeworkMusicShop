import Instruments.Drum;
import Instruments.Instrument;
import Instruments.Type;
import Items.DrumStick;
import Items.Item;
import Items.ItemType;
import Shop.ShopItems;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ShopTest {


    ShopItems shopItems;
    Instrument drum;
    Item drumStick;

    @Before
    public void before() {
        drum = new Drum("metal", "Cherry Red", Type.PERCUSSION, 3, "model 6", 300, 500, 2);
        drumStick = new DrumStick(2.00, 3.00, ItemType.DRUMSTICKS, "brand");
        shopItems = new ShopItems();

    }

    @Test
    public void canAddToShop(){
        shopItems.addStock(drum);
        shopItems.addStock(drumStick);
        assertEquals(2, shopItems.stockCount());
    }

    @Test
    public void canRemoveFromShop(){
        shopItems.addStock(drum);
        shopItems.addStock(drumStick);
        shopItems.removeStock(drum);
        assertEquals(1, shopItems.stockCount());
    }




}
