package com.Pjulax;

public class Floor {
    private int width;
    private int length;
    private String material;
    private String shine;

    public Floor(int width, int length, String material, String shine) {
        this.width = width;
        this.length = length;
        this.material = material;
        this.shine = shine;
    }

    public int getArea() {
        return width * length;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public String getMaterial() {
        return material;
    }

    public String getShine() {
        return shine;
    }
}
