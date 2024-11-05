package fr.babylone.archeo.entites;

public class Professeur extends Archeologue {
	
	public final int EC = 1 ;
	public final int MC = 2 ;
	private int corps ;
	
	// ajouter corps ici et dans constructeur !
	
	public Professeur(int numero, String nom, String prenom, int corps) {
		super(numero, nom, prenom);
		this.corps = corps ;
	}
	
	@Override
	public String toString() {
		
		String corpsToString ;
		switch(corps){
		
			case 1:
				corpsToString = "EC" ;
				break ;
			
			case 2:
				corpsToString = "MC" ;
				break ;
			
			default:
				corpsToString = "Erreur !" ;
		}
		
		return "Enseignant [Corps=" + corpsToString + ", Numero=" + getNumero()
				+ ", Nom=" + getNom() + ", Prenom()=" + getPrenom() + "]";
	}
	

	/**
	 * @return the corps
	 */
	public String getCorps() {
		switch(corps){
			case 1:
				return "EC" ;
			case 2:
				return "MC" ;
			default:
				return "Incorrect" ;
		}
	}

	/**
	 * @param corps the corps to set
	 */
	public void setCorps(int corps) {
		this.corps = corps;
	}
	
	
	
}
