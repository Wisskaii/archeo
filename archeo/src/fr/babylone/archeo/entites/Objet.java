package fr.babylone.archeo.entites;

public class Objet {
	
	public final int COMPLET = 1 ;
	public final int PARTIEL = 2 ;
	
	private int numero ;
	private String designation ;
	private int completude = COMPLET ;
	private Conservation conservation ;
	
	public Objet(int numero, String designation, int completude, Conservation conservation){
		this.numero = numero ;
		this.designation = designation ;
		this.completude = completude ;
		this.conservation = conservation ;
	}
	
	public Objet(int numero, String designation, Conservation conservation){
		this.numero = numero ;
		this.designation = designation ;
		completude = PARTIEL ;
		this.conservation = conservation ;
	}
	
	@Override
	public String toString() {
		
		String completudeToString ;
		
		switch(completude) {
			case 1:
				completudeToString = "COMPLET" ;
				break ;
			case 2:
				completudeToString = "PARTIEL" ;
				break ;
			default:
				completudeToString = "ERREUR !" ;
				break ;
		}
		
		return "Objet [numero=" + numero + ", designation="
				+ designation + ", completude=" + completudeToString + ", conservation=" + conservation + "]";
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
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}

	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	/**
	 * @return the completude
	 */
	public int getCompletude() {
		return completude;
	}

	/**
	 * @param completude the completude to set
	 */
	public void setCompletude(int completude) {
		this.completude = completude;
	}

	/**
	 * @return the conservation
	 */
	public Conservation getConservation() {
		return conservation;
	}

	/**
	 * @param conservation the conservation to set
	 */
	public void setConservation(Conservation conservation) {
		this.conservation = conservation;
	}
	
}
