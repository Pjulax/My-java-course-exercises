public class Hamburger extends Burger {
    private Addition addition3;
    private Addition addition4;

    public Hamburger(String breadRollType, String meat, Addition addition1, Addition addition2, Addition addition3, Addition addition4) {
        super(breadRollType, meat, addition1, addition2);
        this.addition3 = addition3;
        this.addition4 = addition4;
    }

    public Addition getAddition3() {
        return addition3;
    }

    public Addition getAddition4() {
        return addition4;
    }

    @Override
    public double printPartialBill(){
        double superPartialPrice = super.printPartialBill();
        System.out.println("#3: " + getAddition3().getName() + " / " + getAddition3().getPrice() + "$\n" +
                            "#4: " + getAddition4().getName() + " / " + getAddition4().getPrice() + "$");
        return superPartialPrice + getAddition3().getPrice() + getAddition4().getPrice();
    }

}