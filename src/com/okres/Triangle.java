package com.okres;

/**
 * Created by Alex on 13.07.2017.
 */
public class Triangle {

    private Point pointA;
    private Point pointB;
    private Point pointC;

    public void draw(){
        System.out.println(" x = " + getPointA().getX() + " y = " + getPointA().getY());;
        System.out.println(" x = " + getPointB().getX() + " y = " + getPointB().getY());;
        System.out.println(" x = " + getPointC().getX() + " y = " + getPointC().getY());;

    }

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }
}
