import Items.DrumStick;
import Items.ItemType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumStickTest {

    DrumStick drumStick;

    @Before
    public void before() {
        drumStick = new DrumStick(2.00, 3.00, ItemType.DRUMSTICKS, "brand");

    }

    @Test
    public void hasBuyPrice() {
        assertEquals(2.00, drumStick.getBuyPrice(), 0.01);
    }

    @Test
    public void canGetItemType(){
        assertEquals(ItemType.DRUMSTICKS, drumStick.getItemType());
    }

    @Test
    public void hasSellPrice() {
        assertEquals(3.00, drumStick.getSellPrice(), 0.01);
    }

    @Test
    public void canGetBrand(){
        assertEquals("brand", drumStick.getBrand());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(1.00, drumStick.calculateMarkup(), 0.01);
    }

}

