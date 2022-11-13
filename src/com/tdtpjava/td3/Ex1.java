package com.tdtpjava.td3;

public class Ex1 {
    public static void main(String[] args) {
        Point a = new Point("A", 2.5);
        a.afficher();
        a.translate(5.4);
        a.afficher();
    }
}


class Point{
    String nom;
    double abscisse;

    public Point(String nom, double abscisse) {
        this.nom = nom;
        this.abscisse = abscisse;
    }

    public void afficher(){
        System.out.println("Point : "+this.nom + "(" + this.abscisse + ")");
    }

    public void translate(double dx){
        this.abscisse += dx;
    }
}
