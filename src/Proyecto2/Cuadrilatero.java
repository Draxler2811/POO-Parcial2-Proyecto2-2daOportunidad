/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto2;

/**
 *
 * @author ol196
 */
public abstract class Cuadrilatero {

    protected double x1C, x2C, x3C, x4C;
    protected double y1C, y2C, y3C, y4C;

    protected double x1R, x2R, x3R, x4R;
    protected double y1R, y2R, y3R, y4R;

    protected double x1T, x2T, x3T, x4T;
    protected double y1T, y2T, y3T, y4T;

    public Cuadrilatero() {
    }

    public Cuadrilatero(double x1C, double x2C, double x3C, double x4C, double y1C, double y2C, double y3C, double y4C, double x1R, double x2R, double x3R, double x4R, double y1R, double y2R, double y3R, double y4R, double x1T, double x2T, double x3T, double x4T, double y1T, double y2T, double y3T, double y4T) {
        this.x1C = x1C;
        this.x2C = x2C;
        this.x3C = x3C;
        this.x4C = x4C;
        this.y1C = y1C;
        this.y2C = y2C;
        this.y3C = y3C;
        this.y4C = y4C;
        this.x1R = x1R;
        this.x2R = x2R;
        this.x3R = x3R;
        this.x4R = x4R;
        this.y1R = y1R;
        this.y2R = y2R;
        this.y3R = y3R;
        this.y4R = y4R;
        this.x1T = x1T;
        this.x2T = x2T;
        this.x3T = x3T;
        this.x4T = x4T;
        this.y1T = y1T;
        this.y2T = y2T;
        this.y3T = y3T;
        this.y4T = y4T;
    }

    public Cuadrilatero(double x1C, double x2C, double x3C, double x4C, double y1C, double y2C, double y3C, double y4C) {
        this.x1C = x1C;
        this.x2C = x2C;
        this.x3C = x3C;
        this.x4C = x4C;
        this.y1C = y1C;
        this.y2C = y2C;
        this.y3C = y3C;
        this.y4C = y4C;
    }

    public abstract double getAreaRectangulo();

    public abstract double getAreaTrapecio();

    public abstract double getAreaCuadrado();

    public void setX1C(double x1C) {
        this.x1C = x1C;
    }

    public void setX2C(double x2C) {
        this.x2C = x2C;
    }

    public void setX3C(double x3C) {
        this.x3C = x3C;
    }

    public void setX4C(double x4C) {
        this.x4C = x4C;
    }

    public void setY1C(double y1C) {
        this.y1C = y1C;
    }

    public void setY2C(double y2C) {
        this.y2C = y2C;
    }

    public void setY3C(double y3C) {
        this.y3C = y3C;
    }

    public void setY4C(double y4C) {
        this.y4C = y4C;
    }

    public void setX1R(double x1R) {
        this.x1R = x1R;
    }

    public void setX2R(double x2R) {
        this.x2R = x2R;
    }

    public void setX3R(double x3R) {
        this.x3R = x3R;
    }

    public void setX4R(double x4R) {
        this.x4R = x4R;
    }

    public void setY1R(double y1R) {
        this.y1R = y1R;
    }

    public void setY2R(double y2R) {
        this.y2R = y2R;
    }

    public void setY3R(double y3R) {
        this.y3R = y3R;
    }

    public void setY4R(double y4R) {
        this.y4R = y4R;
    }

    public void setX1T(double x1T) {
        this.x1T = x1T;
    }

    public void setX2T(double x2T) {
        this.x2T = x2T;
    }

    public void setX3T(double x3T) {
        this.x3T = x3T;
    }

    public void setX4T(double x4T) {
        this.x4T = x4T;
    }

    public void setY1T(double y1T) {
        this.y1T = y1T;
    }

    public void setY2T(double y2T) {
        this.y2T = y2T;
    }

    public void setY3T(double y3T) {
        this.y3T = y3T;
    }

    public void setY4T(double y4T) {
        this.y4T = y4T;
    }

   

   

}
