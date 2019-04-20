package com.Pjulax;

public class Doors {
    private String material;
    private String handle;

    public Doors(String material, String handle) {
        this.material = material;
        this.handle = handle;
    }

    public void open(){
        System.out.println("Opening the doors");
    }

    public void close(){
        System.out.println("Closing the doors");
    }

    public String getMaterial() {
        return material;
    }

    public String getHandle() {
        return handle;
    }
}
