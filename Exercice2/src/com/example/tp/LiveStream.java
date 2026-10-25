
package com.example.tp;

/**
 * Classe représentant un flux vidéo ou audio en direct.
 * Elle hérite de la classe Media.
 */
public class LiveStream extends Media {

    // Adresse URL permettant d'accéder au flux en direct.
    private String url;

    // Constructeur : initialise le titre et l'adresse du flux.
    public LiveStream(String titre, String url) {
        super(titre);
        this.url = url;
    }

    // Redéfinit lire() pour démarrer le flux en direct.
    @Override
    public void lire() {
        System.out.println("Démarrage du flux en direct : "
            + titre + " – " + url);
    }

    // Retourne -1 pour indiquer que la durée est indéterminée.
    @Override
    public int getDuree() {
        return -1;
    }
}

