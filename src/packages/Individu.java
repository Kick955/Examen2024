package packages;

abstract class Individu {
    private String Nom;
    private String Prenom;
    private int Identifiant;

    public Individu(String Nom, String Prenom, int Identifiant) {
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Identifiant = Identifiant;
    }
}
