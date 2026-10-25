
package com.example.tp;

/**
 * Représente un triangle.
 * La classe Triangle hérite de la classe Forme.
 */
public class Triangle extends Forme {

    // Attributs spécifiques au triangle.
    private double base, hauteur;

    // Constructeur : initialise la couleur, la base et la hauteur.
    public Triangle(String couleur, double base, double hauteur) {
        super(couleur); // Appelle le constructeur de Forme.
        this.base = base;
        this.hauteur = hauteur;
    }

    // Redéfinit dessiner() pour afficher les caractéristiques du triangle.
    @Override
    public void dessiner() {
        System.out.println("Dessiner un triangle de couleur "
            + couleur + ", base=" + base
            + ", hauteur=" + hauteur);
    }
}

