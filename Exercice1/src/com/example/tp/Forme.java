
package com.example.tp;

/**
 * Super-classe représentant une forme géométrique.
 * Les classes Cercle, Rectangle et Triangle héritent de cette classe.
 */
public class Forme {

    // Attribut commun à toutes les formes géométriques.
    // protected permet aux sous-classes d'y accéder directement.
    protected String couleur;

    // Constructeur qui initialise la couleur de la forme.
    public Forme(String couleur) {
        this.couleur = couleur;
    }

    /**
     * Méthode de dessin générique.
     * Elle peut être redéfinie par chaque sous-classe
     * pour afficher les caractéristiques de sa forme.
     */
    public void dessiner() {
        System.out.println("Dessiner une forme de couleur " + couleur);
    }
}


