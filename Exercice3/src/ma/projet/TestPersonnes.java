
package ma.projet;

import ma.projet.bean.Developpeur;
import ma.projet.bean.Manager;
import java.util.*;

public class TestPersonnes {
    public static void main(String[] args) {

        // Création d'une liste pouvant contenir des Personne
        // ou des objets de ses sous-classes.
        List<Personne> equipe = new ArrayList<>();

        // Ajout de développeurs et d'un manager à l'équipe.
        equipe.add(new Developpeur("Ali", 2000));
        equipe.add(new Manager("Hamid", 3000));
        equipe.add(new Developpeur("Hanane", 2200));

        // Affiche chaque personne avec la méthode utilitaire.
        Utils.listerPersonnes(equipe);
    }
}

