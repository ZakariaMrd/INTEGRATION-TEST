package org.example;

public class Rectangle implements FormeFacade{
    private double largeur;
    private double hauteur;

    public Rectangle(double largeur, double hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public double getLargeur() {
        return largeur;
    }

//    public void setLargeur(double largeur) {
//        this.largeur = largeur;
//    }

    public double getHauteur() {
        return hauteur;
    }

//    public void setHauteur(double hauteur) {
//        this.hauteur = hauteur;
//    }

    @Override
    public double aire() {
        return getLargeur()*getHauteur();
    }
}
