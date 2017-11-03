package codeclan.com.raymusicshop;

/**
 * Created by user on 03/11/2017.
 */

public class Part extends Product {

    private String forInstrument;

    public Part(int sellPrice, int buyPrice, String forInstrument) {
        super(sellPrice, buyPrice);

        this.forInstrument = forInstrument;
    }

    public String getForInstrument() {
        return forInstrument;
    }
}
