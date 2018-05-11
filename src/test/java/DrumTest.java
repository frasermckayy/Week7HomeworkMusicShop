import Instruments.Drum;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumTest {

    private Drum drum;

    @Before
    public void before() {
        drum = new Drum(2, 2, 5 ,1);
    }

    @Test
    public void play(){
        assertEquals("Bodum Tiss", drum.getPlay());
    }

}
