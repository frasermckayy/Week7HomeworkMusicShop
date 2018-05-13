import Instruments.Piano;
import Instruments.Type;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PianoTest{

     Piano piano;

    @Before
    public void before() {
        piano = new Piano ("Wooden","Brown", Type.KEYBOARD, 8, "model 12", 800, 500, 88, 3);
    }

    @Test
    public void play(){
        assertEquals("Chime Chime Chime", piano.Play());
    }
}