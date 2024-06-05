package packages;

import java.util.Date;

public class main {
    public static void main(String[] args) {
        // Création des étudiants
        Etudiant etudiant = new Etudiant("Fortier", "Killian", 1, new Date(), "Licence");
        
        etudiant.montrerDetails();

    }
}