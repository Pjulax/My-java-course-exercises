package com.Pjulax;

public class Car extends Vehicle {
    private int tyresSize;
    private String startStopSystem;
    private String windowsSystem;
    private String lockingSystem;
    private String audioSystem;
    private boolean hasAlarm;

    public Car(){
        this(5,"Manual","Petrol engine",16,"Key-lock",
            "Manual","Central System","built-in panel",true);
    }

    public Car( int doors, String gearBox, String engine,
                int tyresSize, String startStopSystem, String windowsSystem,
                String lockingSystem, String audioSystem, boolean hasAlarm){

        super(4, doors, gearBox, "Steering wheel", engine);
        this.tyresSize = tyresSize;
        this.startStopSystem = startStopSystem;
        this.windowsSystem = windowsSystem;
        this.lockingSystem = lockingSystem;
        this.audioSystem = audioSystem;
        this.hasAlarm = hasAlarm;
    }

    public void unlockCar(){
        System.out.println("Method unlockCar() has started");
    }

    public void lockCar(){
        System.out.println("Method lockCar() has started");
    }

    public void turnOnAudio(){
        System.out.println("Method turnOnAudio() has started");
    }

    public void turnOffAudio(){
        System.out.println("Method turnOffAudio() has started");
    }

    private void useStartStopSystem(){
        System.out.println("Method useStartStopSystem() has started");
    }

    @Override
    public void runEngine(){
        useStartStopSystem();
        super.runEngine();
    }

    public void useSteeringWheel(){
        System.out.println("Method useSteeringWheel() has started");
    }

    @Override
    public void changeDirection(int steerRotate){
        useSteeringWheel();
        super.changeDirection(steerRotate);
    }

    private void stepOnAccelerator(){
        System.out.println("Method stepOnAccelerator() has started");
    }

    private void stepOnBreakPedal(){
        System.out.println("Method stepOnBreakPedal() has started");
    }

    @Override
    public void accelerate(int acceleration){
        stepOnAccelerator();
        super.accelerate(acceleration);
    }

    @Override
    public void decelerate(int deceleration){
        stepOnBreakPedal();
        super.decelerate(deceleration);
    }

    public int getTyresSize() {
        return tyresSize;
    }

    public String getStartStopSystem() {
        return startStopSystem;
    }

    public String getWindowsSystem() {
        return windowsSystem;
    }

    public String getLockingSystem() {
        return lockingSystem;
    }

    public String getAudioSystem() {
        return audioSystem;
    }

    public boolean isHasAlarm() {
        return hasAlarm;
    }
}
