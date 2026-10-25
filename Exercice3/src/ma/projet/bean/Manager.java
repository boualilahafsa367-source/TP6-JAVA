
package ma.projet.bean;

import ma.projet.Personne;

/**
 * Représente un manager qui reçoit une prime de 30 %.
 */
public class Manager extends Personne {

    // Initialise le manager grâce au constructeur de Personne.
    public Manager(String nom, double salaireBase) {
        super(nom, salaireBase);
    }

    // Implémente le calcul du salaire spécifique au manager.
    @Override
    public double calculerSalaire() {
        return salaireBase * 1.30; // Salaire de base + 30 %.
    }
}

