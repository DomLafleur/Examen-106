package com.cfpr.enrichissement;

import java.util.Scanner;

public class J2Probleme7 {

	static Scanner lectureClavier = new Scanner(System.in);
	static final String MSG_PHRASE = "Entre une phrase:";
	static String PHRASE;
	
	static int count;
	static char voyelleTableau[] = {'a','e','i','o','u','y'};
	static char consonneTableau[] = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','z'};
	public static void main(String[] args) {
		

	}

	private static void afficherMessage(String phrase) {
		
		System.out.println(phrase);		
	}
	
	public static String saisirPhrase() {
		
	PHRASE = lectureClavier.nextLine();
		
	
	for(int i = 0; i < PHRASE.length(); i++) {
		//if(PHRASE.charAt(i) == voyelleTableau)
		count++;
	}
		return PHRASE;		
	}
}
