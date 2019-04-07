package com.Pjulax;

public class Vehicle {
    private int wheels;
    private int doors;
    private String gearBox;
    private String steer;
    private String engine;
    private int actualSpeed;
    private int direction;

    public Vehicle(){
        this(4,2,"Manual","Steering wheel","Petrol engine");
    }

    public Vehicle(int wheels, int doors, String gearBox, String steer, String engine){
        this.wheels = wheels;
        this.doors = doors;
        this.gearBox = gearBox;
        this.steer = steer;
        this.engine = engine;
        this.actualSpeed = 0;
    }

    public void runEngine(){
        System.out.println("Method runEngine() has started");
    }

    public void ride(){
        System.out.println("Method ride() has started");
        System.out.println("You're riding with " + actualSpeed + " km/h");

    }

    public void changeDirection(int steerRotate){
        System.out.println("Method changeDirection() has started");
        if(steerRotate < 0){
            steerRotate %= 360;
            steerRotate += 360;
        }
        this.direction += steerRotate;
        if(this.direction > 360){
            this.direction %= 360;
        }
        System.out.println("Vehicle direction has changed to " + direction + " degrees");
    }

    public void accelerate(int acceleration){
        System.out.println("Method accelerate() has started");
        System.out.println("Vehicle speed is increasing by " + acceleration);
        if(acceleration > 0){
            this.actualSpeed += acceleration;
        }
    }

    public void decelerate(int deceleration){
        System.out.println("Method decelerate() has started");
        System.out.println("Vehicle speed is decreasing by " + deceleration);
        if(actualSpeed >= deceleration){
            this.actualSpeed -= deceleration;
        }else{
            this.actualSpeed = 0;
        }
    }

    public void changeGear(){
        System.out.println("Method changeGear() has started");
        System.out.println("Gear has been matched to actual speed");
    }

    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }

    public String getGearBox() {
        return gearBox;
    }

    public String getSteer() {
        return steer;
    }

    public String getEngine() {
        return engine;
    }

    public int getActualSpeed() {
        return actualSpeed;
    }

    public int getDirection() {
        return direction;
    }
}
