
package com.example.tp;

/**
 * Classe représentant un média vidéo.
 * Elle hérite de la classe Media.
 */
public class Video extends Media {

    // Durée de la vidéo en secondes.
    private int duree;

    // Résolution de la vidéo, par exemple 1080p.
    private String resolution;

    // Constructeur : initialise le titre, la durée et la résolution.
    public Video(String titre, int duree, String resolution) {
        super(titre); // Initialise le titre dans la classe mère.
        this.duree = duree;
        this.resolution = resolution;
    }

    // Redéfinit lire() pour afficher les informations de la vidéo.
    @Override
    public void lire() {
        System.out.println("Lecture vidéo : " + titre
            + " [" + resolution + "]");
    }

    // Retourne la durée de la vidéo en secondes.
    @Override
    public int getDuree() {
        return duree;
    }
}

