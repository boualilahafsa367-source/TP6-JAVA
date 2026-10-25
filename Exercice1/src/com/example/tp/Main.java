
package com.example.tp;

public class Main {
    public static void main(String[] args) {

        // Création d'un tableau de type Forme.
        // Il peut contenir des objets Forme et ses sous-classes.
        Forme[] formes = new Forme[] {
            new Cercle("Rouge", 5.0),
            new Rectangle("Bleu", 4.0, 3.0),
            new Triangle("Vert", 6.0, 2.5),
            new Forme("Noir") // Objet de la classe Forme elle-même.
        };

        // Parcours de toutes les formes du tableau.
        for (Forme f : formes) {

            // Polymorphisme : Java appelle la méthode dessiner()
            // correspondant à la classe réelle de chaque objet.
            f.dessiner();
        }
    }
}

