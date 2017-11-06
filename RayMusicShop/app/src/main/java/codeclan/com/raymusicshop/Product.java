package codeclan.com.raymusicshop;

/**
 * Created by user on 03/11/2017.
 */

public abstract class Product implements Sellable {
    protected int sellPrice;
    protected int buyPrice;

    public Product(int sellPrice, int buyPrice) {
        this.sellPrice = sellPrice;
        this.buyPrice = buyPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public int calculateMarkUp() {
        return sellPrice - buyPrice;
    }


}
