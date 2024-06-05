package packages;

//Classe Abstract
abstract class Individu {
    private String Nom;
    private String Prenom;
    private int Identifiant;

//Classe Individu
public Individu(String Nom, String Prenom, int Identifiant) {
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Identifiant = Identifiant;
    }

//Creer les getters 

public String getNom() {
return Nom;
}
    
public String getPrenom() {
return Prenom;
}

public int GetIdentifiant() {
return Identifiant;
}

//Creer les setters

public String setNom() {
this.Nom = Nom; 
}

public String setPrenom() {
this.Prenom = Prenom;
}

public int setIdentifiant() {
this.Identifiant = Identifiant;
}

public void montrerDetails());
System.out.println("Etudiant: " + getNom() + " " + getPrenom() + ", ID: " + getIdentifiant() +
        ", Date d'inscription: " + dateInscription + ", Niveau d'étude: " + niveauEtude);
}
}