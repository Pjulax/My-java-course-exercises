package com.Pjulax;

public class Point {
    private int x;
    private int y;

    public Point(){
        this(0,0 );
    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public double distance(){
        return Math.sqrt( Math.pow( (double) this.x, 2) + Math.pow( (double) this.y, 2) );
    }

    public double distance( int x, int y){
        return Math.sqrt( Math.pow( ((double) this.x - (double) x), 2)
                + Math.pow( ((double) this.y - (double) y), 2) );

    }

    public double distance( Point point){
        return Math.sqrt( Math.pow( ((double) this.x - (double) point.getX()), 2)
                + Math.pow( ((double) this.y - (double) point.getY()), 2) );

    }

}
