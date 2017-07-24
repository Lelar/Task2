package com.company;

import java.util.Scanner;

public class Circle extends Figure {

    private double r;
    double pi = 3.14;
    Scanner in = new Scanner(System.in);

    public Circle(double x, double y, double r) {
        super.getX(x);
        super.getY(y);
        this.r = r;
    }

    public Circle() {
        System.out.print("Введиту координату x : ");
        super.getX(in.nextDouble());
        System.out.print("Введиту координату y : ");
        super.getY(in.nextDouble());
        System.out.print("Введиту радиус : ");
        this.r = in.nextDouble();
    }

    public void getRad(double r) {
        this.r = r;
    }

    @Override
    public void write() {
        System.out.println(super.setX() + " " + super.setY() + " " + this.r);
    }

    @Override
    public void move(double x, double y) {
        super.getX(x);
        super.getY(y);
    }

    @Override
    public void scale(double index) {
        super.getX(super.setX() * index);
        super.getY(super.setY() * index);
    }

    @Override
    public double area() {
        return pi * (this.r * this.r);
    }

    public Boolean pointInCircle(double x, double y) {
        if ((x <= super.setX() + this.r) && (y <= super.setY() + this.r) && (x >= super.setX() - this.r) && (y >= super.setY() - this.r))
            return true;
        else return false;
    }

    public Boolean circleInCircle(Circle second) {
        if ((second.setX() + second.r <= super.setX() + this.r) && (second.setY() + second.r <= super.setY() + this.r) && (second.setX() - second.r >= super.setX() - this.r) && (second.setY() - second.r >= super.setY() - this.r))
            return true;
        else return false;
    }

    public double lengthCircle() {
        return 2 * pi * this.r;
    }

    public void moveRNG() {
        super.getX(-99 + Math.random() * 200);
        super.getY(-99 + Math.random() * 200);
    }

    public double lengthBetween(Circle second) {
        return Math.sqrt(Math.pow(Math.abs(super.setX() - second.setX()), 2) + Math.pow(Math.abs(super.setY() - second.setY()), 2));
    }

    public boolean intersection(Circle second) {
        if ((second.setX() == super.setX()) &&(second.setY() == super.setY()) && (second.r == this.r))
            return false;
        else
        if ((Math.sqrt(Math.pow(Math.abs(super.setX() - second.setX()), 2) + Math.pow(Math.abs(super.setY() - second.setY()), 2)) == Math.abs(this.r + second.r)) ||
                (Math.sqrt(Math.pow(Math.abs(super.setX() - second.setX()), 2) + Math.pow(Math.abs(super.setY() - second.setY()), 2)) == Math.abs(this.r - second.r)))
            return true;
        else return false;
    }
}