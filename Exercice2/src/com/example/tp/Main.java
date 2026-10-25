
package com.example.tp;

public class Main {
    public static void main(String[] args) {

        // Création de la bibliothèque de médias.
        MediaLibrary lib = new MediaLibrary();

        // Ajout de deux fichiers audio, d'une vidéo et d'un direct.
        lib.add(new Audio("Podcast Java", 1800));
        lib.add(new Video("Tutoriel UML", 900, "1080p"));
        lib.add(new LiveStream("Concert en direct",
                               "http://live.example.com"));
        lib.add(new Audio("Musique Classique", 2400));

        // Lecture de tous les médias enregistrés.
        lib.playAll();

        System.out.println();

        // Affiche la durée totale des médias dont la durée est connue.
        System.out.println("Durée totale (sec) : "
            + lib.totalDuration());
    }
}

