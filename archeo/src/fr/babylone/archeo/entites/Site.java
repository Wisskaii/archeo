package fr.babylone.archeo.entites;

public class Site {
	
	private int numero ;
	private int longeur ;
	private int largeur ;
	private ZoneFouille zone ;
	
	public Site(int numero, int longeur, int largeur, ZoneFouille zone) {
		this.numero = numero;
		this.longeur = longeur;
		this.largeur = largeur;
		this.zone = zone;
	}
	
	@Override
	public String toString() {
		return "Site [numero=" + numero + ", longeur=" + longeur + ", largeur=" + largeur + ", zone=" + zone + "]";
	}
	
	public int getSuperficie(){
		return longeur * largeur ;
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
	 * @return the longeur
	 */
	public int getLongeur() {
		return longeur;
	}

	/**
	 * @param longeur the longeur to set
	 */
	public void setLongeur(int longeur) {
		this.longeur = longeur;
	}

	/**
	 * @return the largeur
	 */
	public int getLargeur() {
		return largeur;
	}

	/**
	 * @param largeur the largeur to set
	 */
	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}

	/**
	 * @return the zone
	 */
	public ZoneFouille getZone() {
		return zone;
	}

	/**
	 * @param zone the zone to set
	 */
	public void setZone(ZoneFouille zone) {
		this.zone = zone;
	}
	
}
