import Instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    private Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar(5, 1, 1);
    }

    @Test
    public void play(){
        assertEquals("Strum Strum", guitar.getPlay());
    }
}
