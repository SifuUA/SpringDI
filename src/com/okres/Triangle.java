package com.okres;

/**
 * Created by Alex on 13.07.2017.
 */
public class Triangle {

    private String type;

    private Integer height;

    public Triangle(String type) {
        this.type = type;
    }

    public Triangle(String type, Integer height) {
        this.type = type;
        this.height = height;
    }

    public Triangle(int height) {
        this.height = height;
    }

    public void draw(){
        System.out.println(getType() + " Triangle drow " + getHeight());
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getHeight() {
        return height;
    }
}
