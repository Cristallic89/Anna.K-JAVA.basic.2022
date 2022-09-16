package week8;

import java.util.HashMap;
import java.util.Map;

public class Storehouse {
    private Map<String, Integer> products;

    public Storehouse() {
        products = new HashMap<String, Integer>();
    }

    public void addProduct(String product, int price, int stock){
        this.products.put(product, price);
    }

    public int price(String product){
        if(this.products.containsKey(product)){
            return this.products.get(product);
        } else {
            return -99;
        }
    }
}