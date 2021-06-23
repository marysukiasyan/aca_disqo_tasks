package task1;

import static java.lang.Math.abs;

public class Point {
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(){
        double firstLeg = abs(getX());
        double secondLeg = abs(getY());
        double hypotenuseLength = Math.sqrt(Math.pow(firstLeg, 2) + Math.pow(secondLeg, 2
        ));
        return hypotenuseLength;
    }

    public double distance(Point secondPoint){
        double firstLeg = abs((getX()-secondPoint.getX()));
        double secondLeg = abs(getY() - secondPoint.getY());
        double hypotenuseLength = Math.sqrt(Math.pow(firstLeg, 2) + Math.pow(secondLeg, 2
        ));
        return hypotenuseLength;

    }

}
