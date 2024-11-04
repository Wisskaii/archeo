package fr.babylone.archeo.entites;

public class Enseignant extends Archeologue {
	
	public final int EC = 1 ;
	public final int MC = 2 ;
	
	// ajouter corps ici et dans constructeur !
	
	public Enseignant(int numero, String nom, String prenom, int corps) {
		super(numero, nom, prenom);
	}
	
}
