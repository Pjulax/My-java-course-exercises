package com.Pjulax;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5);
	    Case theCase = new Case("220B","Dell","240",dimensions);

	    Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

	    Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

	    PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.powerUp();

        Floor floor = new Floor(15,10,"Oak Wood","Polished");
        Walls walls = new Walls(3,"Acryl","Lapis Lazuli");
        Doors doors = new Doors("Oak Wood","Copper");
        Bed bed = new Bed(200,100,15,"Oak Wood","Polished","Green","Wool","Lazur","Foam");
        Wardrobe wardrobe = new Wardrobe(220,210,180,"Bark Wood","Polish","Silver", new Doors("Bark Wood","Bronze"));

        Room bedroom = new Room(floor,walls,doors,bed,wardrobe);

        bedroom.closeDoors();
        bedroom.openDoors();
        bedroom.closeWardrobe();
        bedroom.openWardrobe();
        bedroom.makeYourBed();
        bedroom.getBed().makeBed();
        bedroom.getDoors().open();
        bedroom.getDoors().close();
    }






}
