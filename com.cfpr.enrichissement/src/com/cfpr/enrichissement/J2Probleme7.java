package com.cfpr.enrichissement;

import java.util.Scanner;

public class J2Probleme7 {

	static Scanner lectureClavier = new Scanner(System.in);
	static String MSG_PHRASE = "Entre une phrase:";
	static String PHRASE;
	
	static int count;
	static char CharatereA = 'a';
	static char CharatereE = 'e';
	static char CharatereI = 'i';
	static char CharatereO = 'o';
	static char CharatereU = 'u';
	static char CharatereY = 'y';
	static char CharatereAMaj = 'A';
	static char CharatereEMaj = 'E';
	static char CharatereIMaj = 'I';
	static char CharatereOMaj = 'O';
	static char CharatereUMaj = 'U';
	static char CharatereYMaj = 'Y';
	public static void main(String[] args) {
		

	}

	private static void afficherMessage(String phrase) {
		
		System.out.println(phrase);		
	}
	
	public static String saisirPhrase() {
		
	PHRASE = lectureClavier.nextLine();
		
	
	for(int i = 0; i < PHRASE.length(); i++) {
		if(PHRASE.charAt(i) == CharatereA || PHRASE.charAt(i) == CharatereA)
		count++;
	}
		PHRASE = PHRASE.toLowerCase().replace(CharatereA, CharatereI);
		PHRASE = PHRASE.toLowerCase().replace(CharatereY, CharatereE);
		return PHRASE;		
	}
}
