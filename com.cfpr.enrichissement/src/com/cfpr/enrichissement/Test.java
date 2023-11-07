package com.cfpr.enrichissement;

import java.util.Scanner;

public class Test {

	
	static final String MSG_SAISIR = "Saisir un nombre au clavier";
	static final String MSG_TERMINER = "Merci d'avoir utilisé le programme!";
	static Scanner lectureClavier = new Scanner(System.in);
	
	public static void main(String[] args) {			
		int x, y, z;
				
		x = lireNombre();
		y = lireNombre();
		
		z = comparerNombres (x, y);
		
		z = comparerNombres(x, y);
		
		afficherMessage(String.valueOf(z));
		
		terminerProgramme();
		
		

	}

	public static void afficherMessage(String message) {
		
		System.out.println(message);
		System.out.println("-----------");
		
	}
	
	public static int comparerNombres(int x, int y) {
		int z = 0;
		
		if(x > y) {
			z = x;
		}
		else {
			z = y;
		}
		return z;
		
	}
	
	public static int lireNombre() {
		int nombre = 0;
		
		
		afficherMessage(MSG_SAISIR);
		
		nombre = lectureClavier.nextInt();
		
		
		return nombre;
	}
	
	public static void terminerProgramme() {
		lectureClavier.close();
		afficherMessage(MSG_TERMINER);
		
	}
	
}
