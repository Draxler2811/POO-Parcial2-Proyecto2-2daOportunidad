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
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cuadrado c1;
        Rectangulo c2;
        Trapecio c3;

        double x1C, x2C, x3C, x4C;
        double y1C, y2C, y3C, y4C;

        double x1R, x2R, x3R, x4R;
        double y1R, y2R, y3R, y4R;

        double x1T, x2T, x3T, x4T;
        double y1T, y2T, y3T, y4T;

        System.out.println("------Cuadrado-----");

        System.out.println("Ingresa la cordenada en x del punto1:");
        x1C = sc.nextDouble();
        System.out.println("Ingresa la cordenada en y del punto1:");
        y1C = sc.nextDouble();
        System.out.println("Ingresa la cordenada en x del punto2:");
        x2C = sc.nextDouble();
        System.out.println("Ingresa la cordenada en y del punto2:");
        y2C = sc.nextDouble();
        System.out.println("Ingresa la cordenada en x del punto3:");
        x3C = sc.nextDouble();
        System.out.println("Ingresa la cordenada en y del punto3:");
        y3C = sc.nextDouble();
        System.out.println("Ingresa la cordenada en x del punto4:");
        x4C = sc.nextDouble();
        System.out.println("Ingresa la cordenada en y del punto4:");
        y4C = sc.nextDouble();

        c1 = new Cuadrado(x1C, x2C, x3C, x4C, y1C, y2C, y3C, y4C);

        System.out.println("---Rectangulo-----");
        System.out.println("Ingresa la cordenada en x del punto1:");
        x1R = sc.nextDouble();
        System.out.println("Ingresa la cordenada en y del punto1:");
        y1R = sc.nextDouble();
        System.out.println("Ingresa la cordenada en x del punto2:");
        x2R = sc.nextDouble();
        System.out.println("Ingresa la cordenada en y del punto2:");
        y2R = sc.nextDouble();
        System.out.println("Ingresa la cordenada en x del punto3:");
        x3R = sc.nextDouble();
        System.out.println("Ingresa la cordenada en y del punto3:");
        y3R = sc.nextDouble();
        System.out.println("Ingresa la cordenada en x del punto4:");
        x4R = sc.nextDouble();
        System.out.println("Ingresa la cordenada en y del punto4:");
        y4R = sc.nextDouble();

        c2 = new Rectangulo(x1R, x2R, x3R, x4R, y1R, y2R, y3R, y4R);

        System.out.println("-----Trapecio-----");
        System.out.println("Ingresa la cordenada en x del punto1:");
        x1T = sc.nextDouble();
        System.out.println("Ingresa la cordenada en y del punto1:");
        y1T = sc.nextDouble();
        System.out.println("Ingresa la cordenada en x del punto2:");
        x2T = sc.nextDouble();
        System.out.println("Ingresa la cordenada en y del punto2:");
        y2T = sc.nextDouble();
        System.out.println("Ingresa la cordenada en x del punto3:");
        x3T = sc.nextDouble();
        System.out.println("Ingresa la cordenada en y del punto3:");
        y3T = sc.nextDouble();
        System.out.println("Ingresa la cordenada en x del punto4:");
        x4T = sc.nextDouble();
        System.out.println("Ingresa la cordenada en y del punto4:");
        y4T = sc.nextDouble();

        c3 = new Trapecio(x1T, x2T, x3T, x4T, y1T, y2T, y3T, y4T);

        System.out.println("la area del cuadrado es:" + c1.getAreaCuadrado());
        System.out.println("La area del Rectangulo es:" + c2.getAreaRectangulo());
        System.out.println("La area del trapecio es: " + c3.getAreaTrapecio());
    }

}
