
package ma.projet;

/**
 * Classe abstraite représentant une personne salariée.
 * Elle sert de classe mère à Developpeur et Manager.
 */
public abstract class Personne {

    // Attributs communs à toutes les personnes.
    // protected permet aux sous-classes d'y accéder.
    // final empêche leur modification après initialisation.
    protected final String nom;
    protected final double salaireBase;

    // Constructeur qui initialise le nom et le salaire de base.
    public Personne(String nom, double salaireBase) {
        this.nom = nom;
        this.salaireBase = salaireBase;
    }

    /**
     * Méthode abstraite : chaque sous-classe doit définir
     * sa propre manière de calculer le salaire.
     * @return salaire calculé
     */
    public abstract double calculerSalaire();

    /**
     * Affiche le nom et le salaire calculé.
     * Cette méthode est héritée par les sous-classes.
     */
    public void affiche() {
        System.out.printf(
            "Je suis %s, salaire = %.2f%n",
            nom, calculerSalaire()
        );
    }
}
