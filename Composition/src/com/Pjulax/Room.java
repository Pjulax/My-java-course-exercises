package com.Pjulax;

public class Room {
    private Floor floor;
    private Walls walls;
    private Doors doors;
    private Bed bed;
    private Wardrobe wardrobe;

    public Room(Floor floor, Walls walls, Doors doors, Bed bed, Wardrobe wardrobe) {
        this.floor = floor;
        this.walls = walls;
        this.doors = doors;
        this.bed = bed;
        this.wardrobe = wardrobe;
    }

    public void openDoors(){
        doors.open();
    }

    public void closeDoors(){
        doors.close();
    }

    public void makeYourBed(){
        bed.makeBed();
    }

    public void openWardrobe(){
        wardrobe.getDoors().open();
    }

    public void closeWardrobe(){
        getWardrobe().closeDoors();
    }

    public Floor getFloor() {
        return floor;
    }

    public Walls getWalls() {
        return walls;
    }

    public Doors getDoors() {
        return doors;
    }

    public Bed getBed() {
        return bed;
    }

    private Wardrobe getWardrobe() {
        return wardrobe;
    }
}
