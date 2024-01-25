package org.example;

import java.util.List;

public class CalculerAire {

    public CalculerAire() {
    }

    public double aire(List<FormeFacade> formes) {
        double aire = 0;
        for (FormeFacade forme : formes) {
           aire+= forme.aire();
        }
        return aire;
    }

}
