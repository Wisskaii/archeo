package fr.babylone.archeo.entites;
import java.util.ArrayList ;

// A finir !!

public class Equipe {
	
	private int numero ;
	private String nom ;
	private Professeur responsable ;
	private ArrayList<Etudiant> etudiants = new ArrayList<Etudiant>() ;
	
	public Equipe(int numero, String nom, Professeur responsable, ArrayList<Etudiant> etudiants) {
		this.numero = numero;
		this.nom = nom;
		this.responsable = responsable;
		this.etudiants = etudiants;
	}

	@Override
	public String toString() {
		return "Equipe [numero=" + numero + ", nom=" + nom + ", responsable=" + responsable + ", etudiants=" + etudiants
				+ "]";
	}
	
	public boolean ajouterMembre(Etudiant etudiant){
		if(etudiants.contains(etudiant)){
			etudiants.add(etudiant) ;
			return true ;
		}
		else{
			return false ;
		}
	}
	
	public boolean retirerMembre(Etudiant etudiant){
		if(etudiants.contains(etudiant)){
			etudiants.remove(etudiant) ;
			return true ;
		}
		else{
			return false ;
		}
	}
	
	public void getMembre(int index){
		// A finir !!
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
	 * @return the responsable
	 */
	public Professeur getResponsable() {
		return responsable;
	}
	/**
	 * @param responsable the responsable to set
	 */
	public void setResponsable(Professeur responsable) {
		this.responsable = responsable;
	}
	/**
	 * @return the etudiants
	 */
	public ArrayList<Etudiant> getEtudiants() {
		return etudiants;
	}
	/**
	 * @param etudiants the etudiants to set
	 */
	public void setEtudiants(ArrayList<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}
	
}
