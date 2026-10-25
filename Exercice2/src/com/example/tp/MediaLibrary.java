
package com.example.tp;

/**
 * Classe qui permet de gérer une bibliothèque de médias.
 */
public class MediaLibrary {

    // Tableau contenant les médias.
    // La capacité initiale est de 4 médias.
    private Media[] items = new Media[4];

    // Nombre de médias réellement enregistrés dans le tableau.
    private int count = 0;

    // Ajoute un média à la bibliothèque.
    public void add(Media m) {

        // Si le tableau est plein, on double sa capacité.
        if (count == items.length) {
            Media[] tmp = new Media[items.length * 2];

            // Copie les anciens médias dans le nouveau tableau.
            System.arraycopy(items, 0, tmp, 0, items.length);

            // Le tableau principal référence le nouveau tableau.
            items = tmp;
        }

        // Ajoute le média à la prochaine position disponible,
        // puis augmente le nombre de médias.
        items[count++] = m;
    }

    // Lit tous les médias enregistrés dans la bibliothèque.
    public void playAll() {
        System.out.println("=== Lecture de la bibliothèque ===");

        for (int i = 0; i < count; i++) {

            // Polymorphisme : appelle la méthode lire()
            // correspondant au type réel de chaque média.
            items[i].lire();
        }
    }

    // Calcule la durée totale des médias dont la durée est connue.
    public int totalDuration() {
        int sum = 0;

        for (int i = 0; i < count; i++) {
            int d = items[i].getDuree();

            // Les durées négatives ou nulles ne sont pas ajoutées.
            if (d > 0) {
                sum += d;
            }
        }

        // Retourne la somme des durées en secondes.
        return sum;
    }
}
