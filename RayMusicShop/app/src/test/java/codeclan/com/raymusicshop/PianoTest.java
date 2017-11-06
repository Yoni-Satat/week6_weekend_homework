package codeclan.com.raymusicshop;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by user on 03/11/2017.
 */

public class PianoTest {
    Piano piano;

    @Before
    public void before() {
        piano = new Piano(20, 10, "Wooding");
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(20, piano.getSellPrice());
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(10, piano.getBuyPrice());
    }

    @Test
    public void canGetFamily() {
        assertEquals("Wooding", piano.getFamily());
    }

    @Test
    public void canPlay() {
        assertEquals("Playing piano", piano.play());
    }

    @Test
    public void canCalculateMarkUp() {
        assertEquals(10, piano.calculateMarkUp());
    }
}
