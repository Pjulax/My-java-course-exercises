package com.Pjulax;

public class Tesla extends Car {
    private String seatsStyle;
    private int tvAmount;
    private boolean heatingSeats;

    public Tesla(){
        this(17,"leather",2,true);
    }

    public Tesla(int tyresSize, String seatsStyle, int tvAmount, boolean heatingSeats){
        super(5,"Automatical","Electrical", tyresSize,
                "Button and proximity sensor", "electrical",
                "Central", "built-in", true);
        this.seatsStyle = seatsStyle;
        this.tvAmount = tvAmount;
        this.heatingSeats = heatingSeats;
    }

    public void turnOnTV(){
        System.out.println("Method turnOnTV() has started");
    }

    public void turnOffTV(){
        System.out.println("Method turnOffTV() has started");
    }

    public void heatSeats(){
        System.out.println("Method heatSeats() has started");
    }

    private void proximityChecker(){
        System.out.println("Method proximityChecker() has started");
    }

    @Override
    public void unlockCar(){
        proximityChecker();
        super.unlockCar();
    }

    @Override
    public void lockCar(){
        proximityChecker();
        super.lockCar();
    }

    @Override
    public void runEngine(){
        super.runEngine();
        super.lockCar();
    }

    public void stopEngine(){
        System.out.println("Method stopEngine() has started");
        decelerate(getActualSpeed());
        super.unlockCar();
    }

    @Override
    public void accelerate(int acceleration){
        super.accelerate(acceleration);
        changeGear();
    }

    @Override
    public void decelerate(int deceleration){
        super.decelerate(deceleration);
        changeGear();
    }

    public String getSeatsStyle() {
        return seatsStyle;
    }

    public int getTvAmount() {
        return tvAmount;
    }

    public boolean isHeatingSeats() {
        return heatingSeats;
    }
}
