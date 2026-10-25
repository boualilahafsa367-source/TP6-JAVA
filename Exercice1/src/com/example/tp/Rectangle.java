
package com.example.tp;

/**
 * Représente un rectangle.
 * La classe Rectangle hérite de la classe Forme.
 */
public class Rectangle extends Forme {

    // Attributs spécifiques au rectangle.
    private double largeur, hauteur;

    // Constructeur : initialise la couleur, la largeur et la hauteur.
    public Rectangle(String couleur, double largeur, double hauteur) {
        super(couleur); // Initialise la partie héritée de Forme.
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    // Redéfinit la méthode dessiner() pour afficher les dimensions du rectangle.
    @Override
    public void dessiner() {
        System.out.println("Dessiner un rectangle de couleur "
            + couleur + ", largeur=" + largeur
            + ", hauteur=" + hauteur);
    }
}

