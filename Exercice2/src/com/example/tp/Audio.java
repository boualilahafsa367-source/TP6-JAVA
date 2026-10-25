
package com.example.tp;

/**
 * Classe représentant un média audio.
 * Elle hérite des attributs et méthodes de Media.
 */
public class Audio extends Media {

    // Durée du fichier audio en secondes.
    private int duree;

    // Constructeur : initialise le titre et la durée.
    public Audio(String titre, int duree) {
        super(titre); // Appelle le constructeur de la classe Media.
        this.duree = duree;
    }

    // Redéfinit la méthode lire() pour un média audio.
    @Override
    public void lire() {
        System.out.println("Lecture audio : " + titre);
    }

    // Retourne la durée réelle du média audio.
    @Override
    public int getDuree() {
        return duree;
    }
}

