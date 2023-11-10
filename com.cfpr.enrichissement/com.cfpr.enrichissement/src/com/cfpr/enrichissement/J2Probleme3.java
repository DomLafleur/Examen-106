package com.cfpr.enrichissement;

import java.util.Scanner;

public class J2Probleme3 {

	static Scanner lectureClavier = new Scanner(System.in);
	static String MSG_PHRASE = "Entre une phrase:";
	static String PHRASE;
	
	static int count;
	static char Charaterea = 'a';
	static char CharatereA = 'A';
	static char Charatere$ = '$';
	
	public static void main(String[] args) {
		
		afficherMessage(MSG_PHRASE);
		
		PHRASE = saisirPhrase();			
		
		afficherMessage(PHRASE.toUpperCase() + " Vous avez " + count + " a.");
		
		lectureClavier.close();

	}

	private static void afficherMessage(String phrase) {
		
		System.out.println(phrase);		
	}
	
	public static String saisirPhrase() {
		
	PHRASE = lectureClavier.nextLine();
		
	
	for(int i = 0; i < PHRASE.length(); i++) {
		if(PHRASE.charAt(i) == CharatereA || PHRASE.charAt(i) == Charaterea)
		count++;
	}
		PHRASE = PHRASE.toLowerCase().replace(CharatereA, Charatere$);
		PHRASE = PHRASE.toLowerCase().replace(Charaterea, Charatere$);
		return PHRASE;		
	}
}
