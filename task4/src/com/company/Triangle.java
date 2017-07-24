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
        a.getX(x);
        a.getY(y);
        b.getX(x);
        b.getY(y);
        c.getX(x);
        c.getY(y);
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
}
