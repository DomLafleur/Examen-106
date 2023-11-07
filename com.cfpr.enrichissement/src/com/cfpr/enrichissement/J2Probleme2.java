package com.cfpr.enrichissement;

import java.util.Scanner;

public class J2Probleme2 {

	static Scanner lectureClavier = new Scanner(System.in);
	static String MSG_PHRASE = "Entre une phrase:";
	static String PHRASE;
	
	public static void main(String[] args) {
		
		afficherMessage(MSG_PHRASE);
		
		PHRASE = saisirPhrase();			
		
		afficherMessage("Il y a " + PHRASE.length() + " caracteres.");
		
		lectureClavier.close();

	}
	
	private static void afficherMessage(String phrase) {
		
		System.out.println(phrase);		
	}
	
	public static String saisirPhrase() {
		
	PHRASE = lectureClavier.nextLine();
		
		return PHRASE;		
	}
}
