package fr.babylone.archeo.entites;

public class ZoneFouille {
	
	private int numero ;
	private String ville ;
	
	public ZoneFouille(int numero, String ville) {
		this.numero = numero;
		this.ville = ville;
	}
	
	@Override
	public String toString() {
		return "ZoneFouille [numero=" + numero + ", ville=" + ville + "]";
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
	 * @return the ville
	 */
	public String getVille() {
		return ville;
	}

	/**
	 * @param ville the ville to set
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}

}
