package com.okres;

/**
 * Created by Alex on 13.07.2017.
 */
public class Triangle {

    private String type;

    public Triangle(String type) {
        this.type = type;
    }

    public void draw(){
        System.out.println(getType() + " Triangle drow");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
