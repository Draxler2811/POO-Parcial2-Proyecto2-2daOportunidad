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

        Cuadrado c1 = new Cuadrado();
        Rectangulo c2 = new Rectangulo();
        Trapecio c3 = new Trapecio();

        System.out.println("------Cuadrado-----");

        System.out.println("Ingresa la cordenada en x del punto1:");
        c1.setX1C(sc.nextDouble());
        System.out.println("Ingresa la cordenada en y del punto1:");
        c1.setY1C(sc.nextDouble());
        System.out.println("Ingresa la cordenada en x del punto2:");
        c1.setX2C(sc.nextDouble());
        System.out.println("Ingresa la cordenada en y del punto2:");
        c1.setY2C(sc.nextDouble());
        System.out.println("Ingresa la cordenada en x del punto3:");
        c1.setX3C(sc.nextDouble());
        System.out.println("Ingresa la cordenada en y del punto3:");
        c1.setY3C(sc.nextDouble());
        System.out.println("Ingresa la cordenada en x del punto4:");
        c1.setX4C(sc.nextDouble());
        System.out.println("Ingresa la cordenada en y del punto4:");
        c1.setY4C(sc.nextDouble());

        System.out.println("---Rectangulo-----");
        System.out.println("Ingresa la cordenada en x del punto1:");
        c2.setX1R(sc.nextDouble());
        System.out.println("Ingresa la cordenada en y del punto1:");
        c2.setY1R(sc.nextDouble());
        System.out.println("Ingresa la cordenada en x del punto2:");
        c2.setX2R(sc.nextDouble());
        System.out.println("Ingresa la cordenada en y del punto2:");
        c2.setY2R(sc.nextDouble());
        System.out.println("Ingresa la cordenada en x del punto3:");
        c2.setX3R(sc.nextDouble());
        System.out.println("Ingresa la cordenada en y del punto3:");
        c2.setY3R(sc.nextDouble());
        System.out.println("Ingresa la cordenada en x del punto4:");
        c2.setX4R(sc.nextDouble());
        System.out.println("Ingresa la cordenada en y del punto4:");
        c2.setY4R(sc.nextDouble());

        System.out.println("-----Trapecio-----");
        System.out.println("Ingresa la cordenada en x del punto1:");
        c3.setX1T(sc.nextDouble());
        System.out.println("Ingresa la cordenada en y del punto1:");
        c3.setY1T(sc.nextDouble());
        System.out.println("Ingresa la cordenada en x del punto2:");
        c3.setX2T(sc.nextDouble());
        System.out.println("Ingresa la cordenada en y del punto2:");
        c3.setY2T(sc.nextDouble());
        System.out.println("Ingresa la cordenada en x del punto3:");
        c3.setX3T(sc.nextDouble());
        System.out.println("Ingresa la cordenada en y del punto3:");
        c3.setY3T(sc.nextDouble());
        System.out.println("Ingresa la cordenada en x del punto4:");
        c3.setX4T(sc.nextDouble());
        System.out.println("Ingresa la cordenada en y del punto4:");
        c3.setY4T(sc.nextDouble());

        System.out.println("la area del cuadrado es:" + c1.getAreaCuadrado());
        System.out.println("La area del Rectangulo es:" + c2.getAreaRectangulo());
        System.out.println("La area del trapecio es: " + c3.getAreaTrapecio());
    }

}
