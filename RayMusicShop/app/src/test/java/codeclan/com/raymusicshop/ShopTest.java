package codeclan.com.raymusicshop;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by user on 03/11/2017.
 */

public class ShopTest {

    Shop shop;

    @Before
    public void before() {
        shop = new Shop("Ray's Music Shop");
    }

    @Test
    public void canGetName() {
        assertEquals("Ray's Music Shop", shop.getName());
    }
}
