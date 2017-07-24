package com.company;

public abstract class Figure implements Methods {
    private double x, y;

    public void getX(double x) {
        this.x = x;
    }

    public void getY(double y) {
        this.y = y;
    }

    public double setX() {
        return this.x;
    }

    public double setY() {
        return this.y;
    }
}
