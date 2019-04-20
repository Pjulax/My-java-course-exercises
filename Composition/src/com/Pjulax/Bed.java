package com.Pjulax;

public class Bed extends Furniture {
    private String beddingMaterial;
    private String beddingColour;
    private String mattress;

    public Bed(int width, int length, int height, String material, String shine, String colour, String beddingMaterial, String beddingColour, String mattress) {
        super(width, length, height, material, shine, colour);
        this.beddingMaterial = beddingMaterial;
        this.beddingColour = beddingColour;
        this.mattress = mattress;
    }

    public void makeBed(){
        System.out.println("Making the bed");
    }

    public String getBeddingMaterial() {
        return beddingMaterial;
    }

    public String getBeddingColour() {
        return beddingColour;
    }

    public String getMattress() {
        return mattress;
    }
}
