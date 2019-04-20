package com.Pjulax;

public class Walls {
    private int height;
    private String wallPainting;
    private String wallColour;

    public Walls(int height, String wallPainting, String wallColour) {
        this.height = height;
        this.wallPainting = wallPainting;
        this.wallColour = wallColour;
    }

    public int getHeight() {
        return height;
    }

    public String getWallPainting() {
        return wallPainting;
    }

    public String getWallColour() {
        return wallColour;
    }
}
