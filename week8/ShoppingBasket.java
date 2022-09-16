package week8;

import java.util.ArrayList;
import java.util.List;

public class ShoppingBasket {
    private List<Purchase> purchases;

    public ShoppingBasket() {
        purchases = new ArrayList<Purchase>();
    }

    public void add(String product, int price){
        this.purchases.add(new Purchase(product, 1, price));
    }

    public int price(){
        int price = 0;
        for (Purchase purchase: this.purchases) {
            price += purchase.price();
        }
        return price;
    }
}