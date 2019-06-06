public class Main {
    public static void main(String[] args) {
        Burger hamburger = new Hamburger("White bread roll", "Porkchop",
                                        new Carrot(), new Cheese(),
                                        new ChilliSauce(), new Lettuce());
        hamburger.printFinalBill();
        Burger healthyBurger = new HealthyBurger("Beef", new Carrot(),
                                            new ChilliSauce(), new Cheese(),
                                            new Lettuce(), new OnionRings(),
                                            new Tomatoe());
        healthyBurger.printFinalBill();
        Burger deluxeBurder = new DeluxeBurger("Baklava", "Vege steak");
        deluxeBurder.printFinalBill();

    }
}
