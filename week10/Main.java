package week10;


public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.12);
        double price = hamburger.itemizeHamburger();
        System.out.println("Total burger price is " + price);
        System.out.println();
        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.addHealthyAddition1("Lentils", 3.41);
        System.out.println("Total Healthy Burger price is " + healthyBurger.itemizeHamburger());
        System.out.println();
        DeluxeBurger deluxeBurger = new DeluxeBurger();
        System.out.println("Total Deluxe Burger price is " + deluxeBurger.itemizeHamburger());
    }
}
