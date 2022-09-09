package week4;

public class Product {
    // price, amount and name
    private double price;
    private int amount;
    private String name;

    public Product(String name, double price, int amount) {
        this.price = price;
        this.amount = amount;
        this.name = name;
    }

    public void printProduct(){
        System.out.println(this.name + ", price " + this.price + ", amount " + this.amount);
    }
}