import Items.ItemType;
import Items.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void before() {
        sheetMusic = new SheetMusic(4.00, 7.00, ItemType.SHEETMUSIC, "brand");

    }

    @Test
    public void hasBuyPrice() {
        assertEquals(4.00, sheetMusic.getBuyPrice(), 0.01);
    }

    @Test
    public void canGetItemType(){
        assertEquals(ItemType.SHEETMUSIC, sheetMusic.getItemType());
    }

    @Test
    public void hasSellPrice() {
        assertEquals(7.00, sheetMusic.getSellPrice(), 0.01);
    }

    @Test
    public void canGetBrand(){
        assertEquals("brand", sheetMusic.getBrand());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(3.00, sheetMusic.calculateMarkup(), 0.01);
    }

}