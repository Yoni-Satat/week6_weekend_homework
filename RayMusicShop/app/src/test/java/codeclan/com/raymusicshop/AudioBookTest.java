package codeclan.com.raymusicshop;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by user on 03/11/2017.
 */

public class AudioBookTest {

    AudioBook audiobook;

    @Before
    public void before() {
        audiobook = new AudioBook(10, 5, "Learn Piano with Luigiano");
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(10, audiobook.getSellPrice());
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(5, audiobook.getBuyPrice());
    }

    @Test
    public void canGetBookName() {
        assertEquals("Learn Piano with Luigiano", audiobook.getBookName());
    }
}
