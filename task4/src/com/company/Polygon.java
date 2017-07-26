package com.company;

import java.util.Scanner;

public class Polygon extends Figure {

    Scanner in = new Scanner(System.in);

    int number = in.nextInt();
    Point array[] = new Point[number];

    public Polygon() {
        for (int i = 0; i < number; i++) {
            array[i] = new Point();
            if ((i > 1) && (array[i - 2].colinearity(array[i - 1], array[i]))) {
                System.out.println("Введите новые данные ");
                i = i - 1;
            }
        }
    }

    @Override
    public void write() {
        for (int i = 0; i < number; i++) {
            System.out.println((i + 1) + "-я вершина : (" + array[i].setX() + " , " + array[i].setY() + ") ");
        }
    }

    @Override
    public void move(double x, double y) {
        for (int i = 0; i < number; i++) {
            array[i].getX(array[i].setX() + x);
            array[i].getY(array[i].setY() + y);
        }
    }

    @Override
    public void scale(double index) {
        for (int i = 0; i < number; i++) {
            array[i].getX(array[i].setX() * index);
            array[i].getY(array[i].setY() * index);
        }
    }

    @Override
    public double area() {
        return 0;
    }

    public double perimeter() {
        double s = 0;
        for (int i = 0; i < (number - 1); i++)
            s = s + array[i].length(array[i + 1]);
        s = s + array[0].length(array[number - 1]);
        return s;
    }

    public void change() {
        boolean end = true;
        while (end) {
            System.out.print("Введите номер элемента : ");
            int i = in.nextInt() - 1;
            if ((0 <= i) && (i < number)) {
                System.out.print("Введите значение x : ");
                array[i].getX(in.nextDouble());
                System.out.print("Введите значение y : ");
                array[i].getY(in.nextDouble());

                checkingCollinearity(i);

                for (int j = 0; j < number; j++) {
                    System.out.println((j + 1) + "-я вершина : (" + array[j].setX() + " , " + array[j].setY() + ") ");
                }
            } else end = !end;
        }
    }

    private void checkingCollinearity(int i) {
        if ((i - 2 >= 0) && (array[i].colinearity(array[i - 1], array[i - 2]))) {
            boolean check = true;
            while (check) {
                if (array[i].colinearity(array[i - 1], array[i - 2])) {
                    System.out.print("Введите другое значение x : ");
                    array[i].getX(in.nextDouble());
                    System.out.print("Введите другое значение y : ");
                    array[i].getY(in.nextDouble());
                } else check = !check;
            }
        }

        if ((i + 2 < number) && (array[i + 2].colinearity(array[i + 1], array[i]))) {
            boolean check = true;
            while (check) {
                if (array[i + 2].colinearity(array[i + 1], array[i])) {
                    System.out.print("Введите другое значение x : ");
                    array[i].getX(in.nextDouble());
                    System.out.print("Введите другое значение y : ");
                    array[i].getY(in.nextDouble());
                } else check = !check;
            }
        }

        if ((i + 1 < number) && (i - 1 >= 0) && (array[i + 1].colinearity(array[i], array[i - 1]))) {
            boolean check = true;
            while (check) {
                if (array[i + 1].colinearity(array[i], array[i - 1])) {
                    System.out.print("Введите другое значение x : ");
                    array[i].getX(in.nextDouble());
                    System.out.print("Введите другое значение y : ");
                    array[i].getY(in.nextDouble());
                } else check = !check;
            }
        }

        if ((i == 0) && (array[number - 1].colinearity(array[i], array[i + 1]))) {
            boolean check = true;
            while (check) {
                if (array[number - 1].colinearity(array[i], array[i + 1])) {
                    System.out.print("Введите другое значение x : ");
                    array[i].getX(in.nextDouble());
                    System.out.print("Введите другое значение y : ");
                    array[i].getY(in.nextDouble());
                } else check = !check;
            }
        }

        if ((i == 1) && (array[number - 1].colinearity(array[i - 1], array[i]))) {
            boolean check = true;
            while (check) {
                if (array[number - 1].colinearity(array[i - 1], array[i])) {
                    System.out.print("Введите другое значение x : ");
                    array[i].getX(in.nextDouble());
                    System.out.print("Введите другое значение y : ");
                    array[i].getY(in.nextDouble());
                } else check = !check;
            }
        }

        if ((i == number - 1) && (array[i].colinearity(array[0], array[1]))) {
            boolean check = true;
            while (check) {
                if (array[i].colinearity(array[0], array[1])) {
                    System.out.print("Введите другое значение x : ");
                    array[i].getX(in.nextDouble());
                    System.out.print("Введите другое значение y : ");
                    array[i].getY(in.nextDouble());
                } else check = !check;
            }
        }

        if ((i == number - 2) && (array[number - 1].colinearity(array[0], array[number - 2]))) {
            boolean check = true;
            while (check) {
                if (array[number - 1].colinearity(array[0], array[number - 2])) {
                    System.out.print("Введите другое значение x : ");
                    array[i].getX(in.nextDouble());
                    System.out.print("Введите другое значение y : ");
                    array[i].getY(in.nextDouble());
                } else check = !check;
            }
        }
    }
}