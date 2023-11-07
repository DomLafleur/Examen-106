package com.cfpr.enrichissement;


public class Probleme2 {
	
	static final String MSG_SAISIR = "Quel est votre numéro d'employé?";
	static final int NB_HEURES_SEMAINES = 30;
	static final int SALAIRE_HORAIRE = 16;
	
	public static void main(String[] args) {	
		int total;
		total = calculerSalaire(SALAIRE_HORAIRE, NB_HEURES_SEMAINES);
		
		afficherMessage(total);
		
	}
	
	
	public static int calculerSalaire(int salaireHoraire, int nbHeuresSemaine) {
		int total = 0;
				
		total = salaireHoraire * nbHeuresSemaine * 2;
		
		return total;
	}
	
public static void afficherMessage(int montant) {
		
		System.out.println(montant);
		System.out.println("-----------");
		
	}
	
	
}
