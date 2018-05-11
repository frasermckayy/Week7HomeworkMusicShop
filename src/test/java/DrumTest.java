import Instruments.Drum;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumTest {

    private Drum drum;

    @Before
    public void before() {
        drum = new Drum();
    }

    @Test
    public void canPlay(){
    assertEquals("Bodum tiss", drum.IPlay());
    }


}
