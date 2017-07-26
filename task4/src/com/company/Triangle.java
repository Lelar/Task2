package com.company;

public class Triangle extends Figure {

    Point a, b, c;

    public Triangle() {
        boolean colin = true;
        while (colin) {
            a = new Point();
            b = new Point();
            c = new Point();
            if (a.colinearity(b, c))
                System.out.println("Выберите другие точки");
            else colin = !colin;
        }
    }

    @Override
    public void write() {
        System.out.println("Вершина а : (" + a.setX() + ", " + a.setY() +
                ")\nВершина b : (" + b.setX() + ", " + b.setY() +
                ")\nВершина c : (" + c.setX() + ", " + c.setY() + ")");
    }

    @Override
    public void move(double x, double y) {
        a.getX(a.setX() + x);
        a.getY(a.setY() + y);
        b.getX(b.setX() + x);
        b.getY(b.setY() + y);
        c.getX(c.setX() + x);
        c.getY(c.setY() + y);
    }

    @Override
    public void scale(double index) {
        a.getX(a.setX() * index);
        a.getY(a.setY() * index);
        b.getX(b.setX() * index);
        b.getY(b.setY() * index);
        c.getX(c.setX() * index);
        c.getY(c.setY() * index);
    }

    public double perimeter() {
        return (a.length(b) + a.length(c) + b.length(c));
    }

    @Override
    public double area() {
        double p = (a.length(b) + a.length(c) + b.length(c)) / 2;
        return Math.sqrt((p * (p - a.length(b)) * (p - a.length(c)) * (p - b.length(c))));
    }

    public void turn(double alpha) {
        alpha = Math.toRadians(alpha);
        double x = (a.setX() + b.setX() + c.setX()) / 3;
        double y = (a.setY() + b.setY() + c.setY()) / 3;
        a.getX(Math.round(-Math.sin(alpha) * (a.setY() - y) + Math.cos(alpha) * (a.setX() - x) + x));
        a.getY(Math.round(Math.cos(alpha) * (a.setY() - y) + Math.sin(alpha) * (a.setX() - x) + y));
        b.getX(Math.round(-Math.sin(alpha) * (b.setY() - y) + Math.cos(alpha) * (b.setX() - x) + x));
        b.getY(Math.round(Math.cos(alpha) * (b.setY() - y) + Math.sin(alpha) * (b.setX() - x) + y));
        c.getX(Math.round(-Math.sin(alpha) * (c.setY() - y) + Math.cos(alpha) * (c.setX() - x) + x));
        c.getY(Math.round(Math.cos(alpha) * (c.setY() - y) + Math.sin(alpha) * (c.setX() - x) + y));
    }

}
