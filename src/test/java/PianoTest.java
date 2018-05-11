import Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest{

    private Piano piano;

    @Before
    public void before() {
        piano = new Piano(88, 3, 1, 1);
    }

    @Test
    public void play(){
        assertEquals("Chime Chime Chime", piano.getPlay());
    }
}