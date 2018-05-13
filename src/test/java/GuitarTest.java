import Instruments.Guitar;
import Instruments.Type;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    private Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar("wooden", "Cherry Red", Type.STRING, 3, "model 6", 300, 500, 5);
    }

    @Test
    public void play(){
        assertEquals("Strum Strum", guitar.Play());
    }

    @Test
    public void getStrings(){
        assertEquals(5, guitar.getStrings());
    }
}
