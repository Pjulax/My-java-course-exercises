class Car{
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;
    private int gear;
    private String shapeType;

    public Car(String name, boolean engine, int cylinders, int wheels, int gear, String shapeType) {
        this.name = name;
        this.engine = engine;
        this.cylinders = cylinders;
        this.wheels = wheels;
        this.gear = gear;
        this.shapeType = shapeType;
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public int getGear() {
        return gear;
    }

    public String getShapeType() {
        return shapeType;
    }

    public String startEngine(){
        return "Engine is working";
    }

    public String accelerate(){
        return "Accelerating";
    }

    public String brake(){
        return "Braking";
    }

}

class OpelAstra extends Car {
    public OpelAstra(){
        super("Asterka boża", true,8,4,6,"hatchback");
    }

    @Override
    public String accelerate() {
        return "ASTERKA NIEZIEMSKO PRZYSPIESZA!!!!!ONEONE!!11111!!ONE!11ONE";
    }

    @Override
    public String brake() {
        return "PROSZE PAŃSTWA ASTERKA NIE DA SIE ZATRZYMAĆ!!!!!!";
    }

}

class HyundaiI30 extends Car {
    public HyundaiI30(){
        super("Hyundai I30", true,6,4,5,"hatchback");
    }

    @Override
    public String startEngine(){
        return "Engine works slightly";
    }

    @Override
    public String accelerate() {
        return "Przyspiesza jak masełko w wielkanoc :)))))";
    }
}

class SeatToledo extends Car {
    public SeatToledo(){
        super("Seat Toledo", true, 6, 4, 6, "sedan");
    }

    @Override
    public String brake(){
        return "Hamuje gładko jak pupcia niemowlęcia (:";
    }
}

class OpelCorsa extends Car {
    public OpelCorsa(){
        super("Opel Corsa", false, 4, 4, 5, "hetchback");
    }

    @Override
    public String startEngine(){
        return "Engine not found :( Run as Flinstones did";
    }
}

public class Main {
    public static void main(String[] args) {
        for(int i=1; i<11; i++){
            Car car = randomCar();
            System.out.println("Car #" + i + " : " + car.getName() + "\n" +
                                " its shape: " + car.getShapeType() + "\n" +
                                " it has " + car.getCylinders() + " cylinders" + "\n" +
                                " it has " + car.getGear() + " gears" + "\n" +
                                " its starting: " + car.startEngine() + "\n" +
                                " its acceleration: " + car.accelerate() + "\n" +
                                " its braking: " + car.brake());
            System.out.println();
        }
    }

    public static Car randomCar(){
        int randomNumber = (int) (Math.random() * 4) +1;
        System.out.println("Random number generated was : " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new OpelAstra();
            case 2:
                return new HyundaiI30();
            case 3:
                return new SeatToledo();
            case 4:
                return new OpelCorsa();
        }
        return null;
    }


}
