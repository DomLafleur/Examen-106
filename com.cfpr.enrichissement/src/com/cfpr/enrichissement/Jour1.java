package com.cfpr.enrichissement;

import java.util.Scanner;

public class Jour1 {
	
	static final String MSG_HELLO = "Hello";
	static final String MSG_DEMANDER_NOM = "Quel est ton nom?";
	
	
	static String nomUtilisateur = "";

	public static void main(String[] args) {
		
		
		afficherMessage(MSG_DEMANDER_NOM);
		nomUtilisateur = saisirNomUtilisateur();
		afficherMessage(MSG_HELLO + " " + nomUtilisateur );
		
	}

	public static void afficherMessage(String message) {
		
		System.out.println(message);
		System.out.println("-----------");
		
	}
	
	public static String saisirNomUtilisateur() {
		String nom = "";
		
		
		Scanner lectureClavier = new Scanner(System.in);
		nom = lectureClavier.nextLine();
		lectureClavier.close();
		
		return nom;
	}


}
