package codeclan.com.raymusicshop;

/**
 * Created by user on 03/11/2017.
 */

public class MusicSheet extends Product {
    private String title;

    public MusicSheet(int sellPrice, int buyPrice, String title) {
        super(sellPrice, buyPrice);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
