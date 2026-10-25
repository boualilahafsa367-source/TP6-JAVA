
package ma.projet;

import java.util.List;

/**
 * Classe utilitaire contenant une méthode pour
 * afficher une liste de personnes.
 */
public class Utils {

    /**
     * Accepte une liste de Personne ou de ses sous-classes.
     * @param personnes liste des personnes à afficher
     */
    public static void listerPersonnes(
            List<? extends Personne> personnes) {

        // Parcourt chaque personne de la liste.
        for (Personne p : personnes) {

            // Appelle affiche() pour chaque objet.
            // Le calcul du salaire dépend de son type réel.
            p.affiche();
        }
    }
}
