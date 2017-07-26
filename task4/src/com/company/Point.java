package com.company;

import java.util.Scanner;

public class Point extends Figure {

    Scanner in = new Scanner(System.in);

    public Point() {
        System.out.print("Введиту координату x : ");
        super.getX(in.nextDouble());
        System.out.print("Введиту координату y : ");
        super.getY(in.nextDouble());
    }

    public Point(double x, double y) {
        super.getX(x);
        super.getY(y);
    }

    @Override
    public void write() {
        System.out.println(super.setX() + " " + super.setY());
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
        return 0;
    }

    public void fourth() {
        if ((super.setX() >= 0) && (super.setY() >= 0)) System.out.print("I-я четверть");
        else if ((super.setX() <= 0) && (super.setY() <= 0)) System.out.print("III-я четверть");
        else if ((super.setX() >= 0) && (super.setY() <= 0)) System.out.print("IV-я четверть");
        else System.out.print("II-я четверть");
    }

    public boolean symmetry(Point second) {
        if ((second.setX() == -super.setX()) && (second.setY() == -super.setY()))
            return true;
        else return false;
    }

    public boolean colinearity(Point second, Point third) {
        if (super.setX() * (second.setY() - third.setY()) - super.setY() * (second.setX() - third.setX()) +
                (second.setX() * third.setY() - third.setX() * second.setY()) == 0) return true;
        else return false;
    }

    public double length(Point pt) {
        return (Math.sqrt(Math.pow(super.setX() - pt.setX(),2) + Math.pow(super.setY() - pt.setY(),2)));
    }

    public boolean equals(Object o){
        if(o == null)
            return false;
        if (o == this)
            return true;
        if (getClass() != o.getClass())
            return false;
        Point e = (Point) o;
        return (this.setX() == e.setX()) && (this.setY() == e.setY());
    }


}