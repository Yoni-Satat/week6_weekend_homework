package codeclan.com.raymusicshop;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by user on 03/11/2017.
 */

public class ShopTest {

    Shop shop;
    Piano piano;
    Part part;

    @Before
    public void before() {
        shop = new Shop("Ray's Music Shop");
        piano = new Piano(20, 10, "Wooding");
        part = new Part(10, 5, "Music Sheet");
    }

    @Test
    public void canGetName() {
        assertEquals("Ray's Music Shop", shop.getName());
    }

    @Test
    public void canGetProduct() {
        assertEquals(0, shop.getProduct().size());
    }

    @Test
    public void canAddProduct() {
        shop.addProduct(piano);
        assertEquals(1, shop.getProduct().size());
    }

    @Test
    public void canRemoveProduct() {
        shop.addProduct(piano);
        assertEquals(1, shop.getProduct().size());
        shop.removeProduct(piano);
        assertEquals(0, shop.getProduct().size());
    }

    @Test
    public void canGetStockMarkUp() {
        shop.addProduct(part);
        shop.addProduct(piano);
        assertEquals(15, shop.getStockMarkUp());
    }
}
