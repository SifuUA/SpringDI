package com.okres;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by Alex on 13.07.2017.
 */
public class Triangle implements ApplicationContextAware, BeanNameAware{

    private Point pointA;
    private Point pointB;
    private Point pointC;
    private ApplicationContext context = null;

    public void draw(){
        System.out.println(" x = " + getPointA().getX() + " y = " + getPointA().getY());;
        System.out.println(" x = " + getPointB().getX() + " y = " + getPointA().getY());;
        System.out.println(" x = " + getPointA().getX() + " y = " + getPointA().getY());;

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

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = context;
    }

    @Override
    public void setBeanName(String beanName) {
        System.out.println("Bean name is " + beanName);
    }
}
