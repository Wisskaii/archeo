package fr.babylone.archeo;
import fr.babylone.archeo.entites.*;


public class AppArcheo {

	public static void main(String[] args) {
		
		
		// Exo 1 - Zones de fouille
		
		ZoneFouille zof1 = new ZoneFouille(1,"Cramont") ;
		System.out.println(zof1.toString());
		System.out.println("Numéro de la zone de fouille : " + zof1.getNumero());
		System.out.println("Ville de la zone de fouille 1 : " + zof1.getVille());
		zof1.setVille("Prouville");
		System.out.println("Changement de ville pour la zone de fouille 1 !");
		System.out.println("Ville de la zone de fouille 1 : " + zof1.toString());
		
		// Exo 2 - Sites
		
		Site st1 = new Site(1, 4, 3, zof1);
		System.out.println(st1.toString());
		System.out.println("Longueur : " + st1.getLongeur());
		System.out.println("Superficie : " + st1.getSuperficie());
		System.out.println("Ville de la zone du site 1 : " + st1.getZone().getVille());
		
		// Exo 3 - Objets
	
		Objet obj1 = new Objet(1, "Pied de table", 1, Conservation.INTACT);
		System.out.println(obj1.toString());
		System.out.println("Designation de l'objet 1 : " + obj1.getDesignation());
		System.out.println("Etat de complétude de l'objet 1 : " + obj1.getCompletude());
		System.out.println("Etat de conservation de l'objet 1 : " + obj1.getConservation());
		
		Objet obj2 = new Objet(2, "Nez de gargouille", 2, Conservation.TRES_MAUVAIS_ETAT);
		System.out.println(obj2.toString());
		System.out.println("Complétude de l'objet 2 : " + obj2.getCompletude());
		obj2.setCompletude(1);
		System.out.println("Complétude de l'objet 2 : " + obj2.getCompletude());
		
		// Exo 4 - Archéologues
		
		
		
	}

}
