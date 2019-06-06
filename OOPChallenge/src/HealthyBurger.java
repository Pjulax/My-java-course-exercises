public class HealthyBurger extends Hamburger {
    private Addition addition5;
    private Addition addition6;

    public HealthyBurger(String meat, Addition addition1, Addition addition2, Addition addition3, Addition addition4, Addition addition5, Addition addition6) {
        super("Brown rye bread roll", meat, addition1, addition2, addition3, addition4);
        this.addition5 = addition5;
        this.addition6 = addition6;
    }

    public Addition getAddition5() {
        return addition5;
    }

    public Addition getAddition6() {
        return addition6;
    }

    @Override
    public double printPartialBill(){
        double superPartialPrice = super.printPartialBill();
        System.out.println("#5: " + getAddition5().getName() + " / " + getAddition5().getPrice() + "$\n" +
                "#6: " + getAddition6().getName() + " / " + getAddition6().getPrice() + "$");
        return superPartialPrice + getAddition5().getPrice() + getAddition6().getPrice();
    }

}
