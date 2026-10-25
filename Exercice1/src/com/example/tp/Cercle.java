
package com.example.tp;

/**
 * Représente un cercle.
 * La classe Cercle hérite de la classe Forme.
 */
public class Cercle extends Forme {

    // Attribut spécifique au cercle.
    private double rayon;

    // Constructeur : initialise la couleur et le rayon.
    public Cercle(String couleur, double rayon) {
        super(couleur); // Appelle le constructeur de la classe Forme.
        this.rayon = rayon;
    }

    // Redéfinition de la méthode dessiner() héritée de Forme.
    // @Override indique que cette méthode remplace celle de la classe mère.
    @Override
    public void dessiner() {
        System.out.println("Dessiner un cercle de couleur "
            + couleur + " et de rayon " + rayon);
    }
}

