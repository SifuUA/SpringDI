package com.okres;

import java.util.List;

/**
 * Created by Alex on 13.07.2017.
 */
public class Triangle {

    private List<Point> points;

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    public void draw(){
        for (Point p : points) {
            System.out.println(p.getX() + " " + p.getY());
        }

    }
}
