package codeclan.com.raymusicshop;

/**
 * Created by user on 03/11/2017.
 */

public class AudioBook extends Product {

    private String bookName;

    public AudioBook(int sellPrice, int buyPrice, String bookName) {
        super(sellPrice, buyPrice);
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }
}
