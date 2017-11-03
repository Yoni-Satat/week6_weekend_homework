package codeclan.com.raymusicshop;

/**
 * Created by user on 03/11/2017.
 */

public abstract class Product {
    private int sellPrice;
    private int buyPrice;

    public Product(int sellPrice, int buyPrice) {
        this.sellPrice = sellPrice;
        this.buyPrice = buyPrice;
    }
}
