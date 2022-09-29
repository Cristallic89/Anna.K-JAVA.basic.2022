package week10;

public class HealthyBurger extends Hamburger {

    private String mHealthyExtra1Name;
    private double mHealthyExtra1Price;

    private String mHealthyExtra2Name;
    private double mHealthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown Rye");
    }

    public void addHealthyAddition1(String name, double price) {
        this.mHealthyExtra1Name = name;
        this.mHealthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.mHealthyExtra2Name = name;
        this.mHealthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();
        if (this.mHealthyExtra1Name != null) {
            hamburgerPrice += this.mHealthyExtra1Price;
            System.out.println("Added " + mHealthyExtra1Name + " for an extra " + mHealthyExtra1Price);
        }
        if (this.mHealthyExtra2Name != null) {
            hamburgerPrice += this.mHealthyExtra2Price;
            System.out.println("Added " + mHealthyExtra2Name + " for an extra " + mHealthyExtra2Price);
        }
        return hamburgerPrice;
    }
}
