package codeclan.com.raymusicshop;

/**
 * Created by user on 03/11/2017.
 */

public abstract class Instrument extends Product {

    private String family;

    public Instrument(int sellPrice, int buyPrice, String family) {
        super(sellPrice, buyPrice);
        this.family = family;
    }

    public String getFamily() {
        return family;
    }
}
