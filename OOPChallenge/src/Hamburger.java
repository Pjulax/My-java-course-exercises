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
    public double printFinalBill(){
        System.out.println("Base Burger price: " + basePrice + "\n"+
                "Additions / prices : \n" +
                "#1: " + getAddition1().getName() + " / " + getAddition1().getPrice() + "\n" +
                "#2: " + getAddition2().getName() + " / " + getAddition2().getPrice() + "\n" +
                "#2: " + getAddition3().getName() + " / " + getAddition3().getPrice() + "\n" +
                "#2: " + getAddition4().getName() + " / " + getAddition4().getPrice() + "\n" +
                "Summary: " + (basePrice+addition1.getPrice()+addition2.getPrice()+addition3.getPrice()+addition4.getPrice()) + "$ to pay");
    }
}