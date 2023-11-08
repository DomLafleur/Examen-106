package com.cfpr.enrichissement;

public class J3Defi {

	public static final String ALPHABET = ("abcdefghijklmnopqrstuvwxyz");

	public static void main(String[] args) {
	 char tableau[] = new char [ALPHABET.length()];	
		
	 tableau = boucleCaractere(ALPHABET);	
	 
	 afficherMessage(tableau);

	}

	private static void afficherMessage(char[] tableau) {
		
		for(int i = 0; i < tableau.length; i++) {
			
			System.out.println(tableau[i]);

			
		}
	}
	
	private static char[] boucleCaractere(String ALPHABET) {
		char tableauRe[] = new char [ALPHABET.length()];
		
		
		for(int i = 0; i < tableauRe.length; i++) {
		
			tableauRe[i] = ALPHABET.charAt(i);

			
		}
		
		return tableauRe;
	}
}
