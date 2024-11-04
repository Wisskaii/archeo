package fr.babylone.archeo.entites;

public class Archeologue {
	
	private int numero ;
	private String nom ;
	private String prenom ;
	
	public Archeologue(int numero, String nom, String prenom) {
		this.numero = numero;
		this.nom = nom;
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "Archeologue [numero=" + numero + ", nom=" + nom + ", prenom=" + prenom + "]";
	}

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
}
