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
public class Cuadrado extends Cuadrilatero {

    Scanner sc = new Scanner(System.in);

    Cuadrado() {

    }

    public Cuadrado(double x1C, double x2C, double x3C, double x4C, double y1C, double y2C, double y3C, double y4C) {
        super(x1C, x2C, x3C, x4C, y1C, y2C, y3C, y4C);
    }

    @Override
    public double getAreaCuadrado() {
        double areacuadrado = Math.abs(x1C * y2C) + (x2C * y3C) + (x3C * y4C) + (x4C * y1C);
        double resta = (y1C * x2C) + (y2C * x3C) + (y3C * x4C) + (y4C * x1C);
        double suma = (areacuadrado - resta) / 2;
        return suma;
    }

    @Override
    public double getAreaRectangulo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

    @Override
    public double getAreaTrapecio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
