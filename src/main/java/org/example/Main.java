package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CalculerAire calculerAire = new CalculerAire();
        Cercle cercle1  = new Cercle(10);
        Cercle cercle2  = new Cercle(20);
        Rectangle rectangle1 = new Rectangle(10, 20);
        Rectangle rectangle2 = new Rectangle(20, 30);
        List<FormeFacade> formes = List.of(cercle1, cercle2, rectangle1, rectangle2);
        System.out.println("Aire totale = " + calculerAire.aire(formes));
    }
}
