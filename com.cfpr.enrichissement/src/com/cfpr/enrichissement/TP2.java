package com.cfpr.enrichissement;

import java.util.Scanner;

public class TP2 {
	
	public static Scanner scanner = new Scanner(System.in);
	public static String operation;
	public static void main(String[] args) {
		afficherMenu();       
		operation = choixOperation(scanner, operation);

	}

	public static String choixOperation(Scanner scanner, String operation) {
    	// Choix de l'operation
		operation = scanner.next();

        switch (operation) {
	        case "a", "A":
	        	calculAddition(scanner, 0);
	            break;
	        case "s", "S":
	        	calculSoustraction(scanner, 0);
	            break;
	        case "x", "X":
	        	calculMultiplication(scanner, 0);
	            break;
	        case "d", "D":
	        	calculDivision(scanner, 0);
	            break;
	        case "m", "M":
	        	calculModulo(scanner, 0);
	            break;
	        case "c", "C":
	        	calculPuissanceAuCarre(scanner, 0);
	            break;
	        case "p", "P":
	        	calculPuissance(scanner, 0);
	            break;
	        case "r", "R":
	        	calculRacineCarree(scanner, 0);
	            break;
	        case "l", "L":
	        	calculLogarithme(scanner, 0);
	            break;
	        case "q", "Q":
	            System.out.println("Vous avez quitté le programme.");
	            break;
	       
	        default:
	            System.out.println("Option invalide.");
	     }
        scanner.close();
		return operation;
    }
	
	public static int calculAddition(Scanner scanner, int nombre) {
		int resultat = 0;
		
		nombre = scanner.nextInt();
		
		
		
		scanner.close();
		return resultat;
	}
	
	public static int calculSoustraction(Scanner scanner, int nombre) {
		int resultat = 0;
		
		scanner.close();
		return resultat;
	}
	
	public static int calculMultiplication(Scanner scanner, int nombre) {
		int resultat = 0;
		
		scanner.close();
		return resultat;
	}
	
	public static int calculDivision(Scanner scanner, int nombre) {
		int resultat = 0;
		
		scanner.close();
		return resultat;
	}
	
	public static int calculModulo(Scanner scanner, int nombre) {
		int resultat = 0;
		
		scanner.close();
		return resultat;
	}
	
	public static int calculPuissanceAuCarre(Scanner scanner, int nombre) {
		int resultat = 0;
		
		scanner.close();
		return resultat;
	}
	
	public static int calculPuissance(Scanner scanner, int nombre) {
		int resultat = 0;
		
		scanner.close();
		return resultat;
	}
	
	public static int calculRacineCarree(Scanner scanner, int nombre) {
		int resultat = 0;
		
		scanner.close();
		return resultat;
	}
	
	public static int calculLogarithme(Scanner scanner, int nombre) {
		int resultat = 0;
		
		scanner.close();
		
		return resultat;
	}
	
	public static void fermerProgramme(Scanner scanner) {
		int resultat;
		
		scanner.close();
	}
	
	public static void resultatOperation() {
		
	}
	
	private static void afficherMenu() {
		
		    System.out.println("Bienvenue");
	        System.out.println("Veuillez choisir votre operation en cliquant sur les lettres suivantes:");	  
	        System.out.println(" Addition--> A, Soustraction--> S, multiplication--> X, Division--> D, Modulo--> M, Puissance au carré--> C, Puissance--> P,  Racine carrée--> R, Logarithme--> L ou voulez vous Quitter le programme--> Q?");			
	}
}
