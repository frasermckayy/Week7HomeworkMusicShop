import Items.GuitarString;
import Items.ItemType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringTest {

    GuitarString guitarString;

    @Before
    public void before() {
        guitarString = new GuitarString(8.00, 11.00, ItemType.GUITARSTRINGS, "Stagg");
    }

    @Test
    public void buyPrice() {
        assertEquals(8.00, guitarString.getBuyPrice(), 0.01);
    }

    @Test
    public void hasBrand(){
        assertEquals("Stagg", guitarString.getBrand());
    }

    @Test
    public void sellPrice(){
        assertEquals(11.00, guitarString.getSellPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(3.00, guitarString.calculateMarkup(), 0.01);
    }

    @Test
    public void hasAccessoryType(){
        assertEquals(ItemType.GUITARSTRINGS, guitarString.getItemType());
    }


}
