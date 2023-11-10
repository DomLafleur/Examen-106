package com.cfpr.enrichissement;

import java.util.Scanner;

public class J2Probleme4 {

	static Scanner lectureClavier = new Scanner(System.in);
	static String MSG_PHRASE = "Entre un numero:";
	static String MSG_BONNE_REPONSE = "Bonne entree";
	static int numero;
	
	public static void main(String[] args) {						
		
		do{
			afficherMessage(MSG_PHRASE);
			numero = saisirValeur();
			
		}
			while(numero > 100 || numero < 0);		
		
		afficherMessage(MSG_BONNE_REPONSE);
		lectureClavier.close();			
	}

	private static void afficherMessage(String message) {
		
		System.out.println(message);
	}
	
	public static int saisirValeur() {
		
		numero = lectureClavier.nextInt();		
		return numero;
	}
}
