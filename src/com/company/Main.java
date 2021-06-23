package com.company;

import task1.Point;

public class Main {

    public static void main(String[] args) {
        //task1 distance() method testing
        Point point1 = new Point(2, 3);
        System.out.println(point1.distance());

        //task1 distance(Point secondPoint) method testing
        Point point2 = new Point(-2, -13);
        System.out.println(point1.distance(point2));
    }
}
