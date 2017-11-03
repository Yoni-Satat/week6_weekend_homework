package codeclan.com.raymusicshop;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by user on 03/11/2017.
 */

public class MusicSheetTest {
    MusicSheet musicsheet;

    @Before
    public void before() {
        musicsheet = new MusicSheet(6, 3, "Living on a prayer");
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(6, musicsheet.getSellPrice());
    }

    @Test
    public void canGetBuyValue() {
        assertEquals(3, musicsheet.getBuyPrice());
    }

    @Test
    public void caGetTitle() {
        assertEquals("Living on a prayer", musicsheet.getTitle());
    }
}
