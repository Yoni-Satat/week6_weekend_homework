package codeclan.com.raymusicshop;

/**
 * Created by user on 03/11/2017.
 */

public abstract class Instruments extends Product {

    private String family;

    public Instruments(int sellPrice, int buyPrice, String family) {
        super(sellPrice, buyPrice);
    }
}
