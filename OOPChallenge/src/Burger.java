public class Burger {
    private String breadRollType;
    private String meat;
    private Addition addition1;
    private Addition addition2;
    private double basePrice;

    public Burger(String breadRollType, String meat, Addition addition1, Addition addition2){
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.addition1 = addition1;
        this.addition2 = addition2;
        this.basePrice = 8.99;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public Addition getAddition1() {
        return addition1;
    }

    public Addition getAddition2() {
        return addition2;
    }

    public double printPartialBill(){
        System.out.println("Your order:" + this.getClass().getName() + "\n" +
                        "Base Burger price: " + basePrice + "\n"+
                        "Additions / prices : \n" +
                        "#1: " + addition1.getName() + " / " + addition1.getPrice() + "$\n" +
                        "#2: " + addition2.getName() + " / " + addition2.getPrice() + "$");
        return basePrice + addition1.getPrice() + addition2.getPrice();
    }

    public void printFinalBill(){
        double summaryPrice = printPartialBill();
        System.out.println("Summary: " + summaryPrice + "$ to pay");
    }
}


