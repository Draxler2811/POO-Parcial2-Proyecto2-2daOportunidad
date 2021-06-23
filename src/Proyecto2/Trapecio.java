/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto2;

import java.util.Scanner;

/**
 *
 * @author ol196
 */
public class Trapecio extends Cuadrilatero {

    Scanner sc = new Scanner(System.in);

    public Trapecio() {
    }

    public Trapecio(double x1C, double x2C, double x3C, double x4C, double y1C, double y2C, double y3C, double y4C, double x1R, double x2R, double x3R, double x4R, double y1R, double y2R, double y3R, double y4R, double x1T, double x2T, double x3T, double x4T, double y1T, double y2T, double y3T, double y4T) {
        super(x1C, x2C, x3C, x4C, y1C, y2C, y3C, y4C, x1R, x2R, x3R, x4R, y1R, y2R, y3R, y4R, x1T, x2T, x3T, x4T, y1T, y2T, y3T, y4T);
    }

    Trapecio(double x1T, double x2T, double x3T, double x4T, double y1T, double y2T, double y3T, double y4T) {
        this.x1T = x1T;
        this.x2T = x2T;
        this.x3T = x3T;
        this.x4T = x4T;
        this.y1T = y1T;
        this.y2T = y2T;
        this.y3T = y3T;
        this.y4T = y4T;
    }

    @Override
    public double getAreaRectangulo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getAreaTrapecio() {
        double areatrapecio = Math.abs(x1T * y2T) + (x2T * y3T) + (x3T * y4T) + (x4T * y1T);
        double resta = (y1T * x2T) + (y2T * x3T) + (y3T * x4T) + (y4T * x1T);
        double suma = (areatrapecio - resta) / 2;
        return suma;
    }

    @Override
    public double getAreaCuadrado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setY4T(double y4T) {
        super.setY4T(y4T); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setY3T(double y3T) {
        super.setY3T(y3T); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setY2T(double y2T) {
        super.setY2T(y2T); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setY1T(double y1T) {
        super.setY1T(y1T); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setX4T(double x4T) {
        super.setX4T(x4T); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setX3T(double x3T) {
        super.setX3T(x3T); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setX2T(double x2T) {
        super.setX2T(x2T); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setX1T(double x1T) {
        super.setX1T(x1T); //To change body of generated methods, choose Tools | Templates.
    }

}
