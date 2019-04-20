package com.Pjulax;

public class Furniture {
    private int width;
    private int length;
    private int height;
    private String material;
    private String shine;
    private String colour;

    public Furniture(int width, int length, int height, String material, String shine, String colour) {
        this.width = width;
        this.length = length;
        this.height = height;
        this.material = material;
        this.shine = shine;
        this.colour = colour;
    }

    public int getArea() {
        return length * width;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public String getMaterial() {
        return material;
    }

    public String getShine() {
        return shine;
    }

    public String getColour() {
        return colour;
    }
}
