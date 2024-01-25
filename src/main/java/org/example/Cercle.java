package org.example;

public class Cercle implements FormeFacade{
    private double rayon;
    public Cercle(double rayon) {
        this.rayon = rayon;
    }
    public double getRayon() {
        return rayon;
    }
    @Override
    public double aire() {
        return getRayon()*getRayon()*Math.PI;
    }
}
