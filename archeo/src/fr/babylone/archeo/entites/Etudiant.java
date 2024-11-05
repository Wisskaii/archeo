package fr.babylone.archeo.entites;

public class Etudiant extends Archeologue {
	
	private AnneeEtude niveauScolaire ;
	
	public Etudiant(int numero, String nom, String prenom, AnneeEtude niveauScolaire){
		super(numero, nom, prenom);
		this.niveauScolaire = niveauScolaire ;
	}
	
	@Override
	public String toString() {
		return "Etudiant [Numero= " + getNumero() + ", Nom= " + getNom()
				+ ", Prenom= " + getPrenom() + " NiveauScolaire= " + niveauScolaire + "]";
	}

	/**
	 * @return the niveauScolaire
	 */
	public AnneeEtude getNiveauScolaire() {
		return niveauScolaire;
	}

	/**
	 * @param niveauScolaire the niveauScolaire to set
	 */
	public void setNiveauScolaire(AnneeEtude niveauScolaire) {
		this.niveauScolaire = niveauScolaire;
	}
	
	
	
}
