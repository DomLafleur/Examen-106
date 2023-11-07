package com.cfpr.enrichissement;

import java.util.Scanner;

public class J2Probleme1 {
	
	static Scanner lectureClavier = new Scanner(System.in);
	static String MSG_PHRASE = "Entre une phrase:";
	static String PHRASE;



	public static void main(String[] args) {

		afficherMessage(MSG_PHRASE);
		
		PHRASE = saisirPhrase();			
		
		afficherMessage(PHRASE.toUpperCase());
		
		lectureClavier.close();
	}
	
	private static void afficherMessage(String message) {
		
		System.out.println(message);
	}
	
	public static String saisirPhrase() {
		
	PHRASE = lectureClavier.nextLine();
		
		return PHRASE;
	}

}
