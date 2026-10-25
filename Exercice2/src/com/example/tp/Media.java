
package com.example.tp;

/**
 * Classe mère représentant un média.
 * Audio, Video et LiveStream héritent de cette classe.
 */
public class Media {

    // Attribut commun à tous les médias.
    protected String titre;

    // Constructeur qui initialise le titre du média.
    public Media(String titre) {
        this.titre = titre;
    }

    // Méthode générique pour lire un média.
    // Elle pourra être redéfinie dans les sous-classes.
    public void lire() {
        System.out.println("Lecture de : " + titre);
    }

    // Retourne la durée du média en secondes.
    // Par défaut, la durée est égale à 0.
    public int getDuree() {
        return 0;
    }
}

