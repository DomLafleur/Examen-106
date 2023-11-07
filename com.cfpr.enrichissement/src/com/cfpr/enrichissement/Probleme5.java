package com.cfpr.enrichissement;

public class Probleme5 {
	public static double MONTANT = 100;
	public static double RABAIS = 0.25;
	public static void main(String[] args) {
		double prix;
		
		prix = MONTANT - (MONTANT * RABAIS); 
		afficherMessage(String.valueOf(prix));  
	}

	private static void afficherMessage(String message) {
		
		System.out.println(message);
	}
}
