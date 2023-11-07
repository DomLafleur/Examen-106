package com.cfpr.enrichissement;

public class Probleme3 {

	public static int AGE_PERSONNE_1 = 15;
	public static int AGE_PERSONNE_2 = 92;
	public static void main(String[] args) {
		int total;
		int agePlusVieux;
		
		total = calculerAge(AGE_PERSONNE_1, AGE_PERSONNE_2);
		
		afficherMessage(total);
		
		agePlusVieux = afficherAgePlusGrand(AGE_PERSONNE_1, AGE_PERSONNE_2);
		
		afficherMessage(agePlusVieux);
		
	}

	public static int calculerAge(int agePersonne1,int agePersonne2) {
		int total = 0;
				
		total = (agePersonne1 + agePersonne2) / 2 ;
		
		return total;
	}
	
	public static void afficherMessage(int montant) {
	
		System.out.println(montant);
		System.out.println("-----------");
		
	}
	
	public static int afficherAgePlusGrand(int agePersonne1,int agePersonne2) {
		int agePlusVieux = 0;
		
		if(agePersonne1 > agePersonne2){
			agePlusVieux = agePersonne1;
		}
		else{
			agePlusVieux = agePersonne2;
		}
		
		
		
		return agePlusVieux;
	}
}
