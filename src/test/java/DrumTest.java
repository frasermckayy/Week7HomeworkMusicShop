import Instruments.Drum;
import Instruments.Type;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumTest {

    private Drum drum;

    @Before
    public void before() {
        drum = new Drum("metal", "Cherry Red", Type.STRING, 3, "model 6", 300, 500, 2);
    }

    @Test
    public void play(){
        assertEquals("Bodum Tiss", drum.Play());
    }

}
