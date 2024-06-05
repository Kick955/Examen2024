package packages;

class Etudiant extends Individu {
    public Etudiant(String Nom, String Prenom, int Identifiant) {
		super(Nom, Prenom, Identifiant);
		
	    public Date getDateInscription() {
	        return dateInscription;
	    }

	    public void setDateInscription(Date dateInscription) {
	        this.dateInscription = dateInscription;
	    }

	    public String getNiveauEtude() {
	        return niveauEtude;
	    }

	    public void setNiveauEtude(String niveauEtude) {
	        this.niveauEtude = niveauEtude;
	    }
	   
	    // Methode qui affiche les informations du cours
	    public void montrerDetails() {
	        System.out.println("Titre: " + getTitre() + "Formateur " + getFormateur() + ", Duree H" + getDuree() +
	                ", placesRestantes: " + placesRestantes);
	    }
	}