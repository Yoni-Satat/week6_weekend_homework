package codeclan.com.raymusicshop;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by user on 03/11/2017.
 */

public class PartTest {

    Part part;

    @Before
    public void before() {
        part = new Part(2, 1, "Piano Keyboard");
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(2, part.getSellPrice());
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(1, part.getBuyPrice());
    }

    @Test
    public void canGetForInstrument() {
        assertEquals("Piano Keyboard", part.getForInstrument());
    }
}
