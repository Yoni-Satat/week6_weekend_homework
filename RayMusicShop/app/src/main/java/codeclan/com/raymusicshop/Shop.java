package codeclan.com.raymusicshop;

import java.util.ArrayList;

/**
 * Created by user on 03/11/2017.
 */

public class Shop {

    private String name;
    private ArrayList<Sellable> product;


    public Shop(String name) {
        this.name = name;
        this.product = new ArrayList<Sellable>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Sellable> getProduct() {
        return product;
    }

    public void addProduct(Sellable product) {
        this.product.add(product);
    }
}
