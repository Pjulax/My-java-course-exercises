package com.Pjulax;

public class Wardrobe extends Furniture {
    private Doors doors;

    public Wardrobe(int width, int length, int height, String material, String shine, String colour, Doors doors) {
        super(width, length, height, material, shine, colour);
        this.doors = doors;
    }

    public void openDoors(){
        doors.open();
    }

    public void closeDoors(){
        doors.close();
    }

    public Doors getDoors() {
        return doors;
    }
}
