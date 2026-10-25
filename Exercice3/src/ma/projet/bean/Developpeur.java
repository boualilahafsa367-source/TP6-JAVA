
package ma.projet.bean;

import ma.projet.Personne;

/**
 * Représente un développeur qui reçoit une prime de 10 %.
 */
public class Developpeur extends Personne {

    // Appelle le constructeur de Personne pour initialiser
    // le nom et le salaire de base.
    public Developpeur(String nom, double salaireBase) {
        super(nom, salaireBase);
    }

    // Implémente la méthode abstraite héritée de Personne.
    @Override
    public double calculerSalaire() {
        return salaireBase * 1.10; // Salaire de base + 10 %.
    }
}

