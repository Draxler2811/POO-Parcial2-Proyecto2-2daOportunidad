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
public class Rectangulo extends Cuadrilatero {

    Scanner sc = new Scanner(System.in);

    public Rectangulo() {
    }

    public Rectangulo(double x1C, double x2C, double x3C, double x4C, double y1C, double y2C, double y3C, double y4C, double x1R, double x2R, double x3R, double x4R, double y1R, double y2R, double y3R, double y4R, double x1T, double x2T, double x3T, double x4T, double y1T, double y2T, double y3T, double y4T) {
        super(x1C, x2C, x3C, x4C, y1C, y2C, y3C, y4C, x1R, x2R, x3R, x4R, y1R, y2R, y3R, y4R, x1T, x2T, x3T, x4T, y1T, y2T, y3T, y4T);
    }

    Rectangulo(double x1R, double x2R, double x3R, double x4R, double y1R, double y2R, double y3R, double y4R) {
        this.x1R = x1R;
        this.x2R = x2R;
        this.x3R = x3R;
        this.x4R = x4R;
        this.y1R = y1R;
        this.y2R = y2R;
        this.y3R = y3R;
        this.y4R = y4R;
    }

    @Override
    public double getAreaRectangulo() {
        double arearectangulo = Math.abs(x1R * y2R) + (x2R * y3R) + (x3R * y4R) + (x4R * y1R);
        double resta = (y1R * x2R) + (y2R * x3R) + (y3R * x4R) + (y4R * x1R);
        double suma = (arearectangulo - resta) / 2;
        return suma;
    }

    @Override
    public double getAreaTrapecio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getAreaCuadrado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
