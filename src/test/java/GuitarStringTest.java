import Items.GuitarStrings;
import Items.ItemType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringTest {

    GuitarStrings guitarStrings;

    @Before
    public void before() {
        guitarStrings = new GuitarStrings(8.00, 11.00, ItemType.GUITARSTRINGS, "Stagg");
    }

    @Test
    public void buyPrice() {
        assertEquals(8.00, guitarStrings.getBuyPrice(), 0.01);
    }

    @Test
    public void hasBrand(){
        assertEquals("Stagg", guitarStrings.getBrand());
    }

    @Test
    public void sellPrice(){
        assertEquals(11.00, guitarStrings.getSellPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(3.00, guitarStrings.calculateMarkup(), 0.01);
    }

    @Test
    public void hasAccessoryType(){
        assertEquals(ItemType.GUITARSTRINGS, guitarStrings.getItemType());
    }


}
