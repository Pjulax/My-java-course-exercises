public class DeluxeBurger extends Burger{
    public DeluxeBurger(String breadRollType, String meat) {
        super(breadRollType, meat, new Fries, new Drink);
    }

    public DeluxeBurger(){
        this("White", "Beef");
    }


}
