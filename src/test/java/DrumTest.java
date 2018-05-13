import Instruments.Drum;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumTest {

    private Drum drum;

    @Before
    public void before() {
        drum = new Drum("metal", "red", type.PERCUSION, 14, 12 );
    }

    @Test
    public void play(){
        assertEquals("Bodum Tiss", drum.getPlay());
    }

}
