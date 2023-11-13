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
	        	calculAddition();
	            break;
	        case "s", "S":
	        	calculSoustraction();
	            break;
	        case "x", "X":
	        	calculMultiplication();
	            break;
	        case "d", "D":
	        	calculDivision();
	            break;
	        case "m", "M":
	        	calculModulo();
	            break;
	        case "c", "C":
	        	calculPuissanceAuCarre();
	            break;
	        case "p", "P":
	        	calculPuissance();
	            break;
	        case "r", "R":
	        	calculRacineCarree();
	            break;
	        case "l", "L":
	        	calculLogarithme();
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
	
	public static void calculAddition() {
		int resultat;
		int nombre1;
		int nombre2;
		
		System.out.println("Choisir le premier nombre:");
		nombre1 = scanner.nextInt();
		System.out.println("Choisir le deuxieme nombre:");
		nombre2 = scanner.nextInt();
		
		resultat = nombre1 + nombre2;
		System.out.println(nombre1 + " + " + nombre2 + "=" + resultat);
		
		
		scanner.close();
	}
	
	public static void calculSoustraction() {
		int resultat;
		int nombre1;
		int nombre2;
		
		System.out.println("Choisir le premier nombre:");
		nombre1 = scanner.nextInt();
		System.out.println("Choisir le deuxieme nombre:");
		nombre2 = scanner.nextInt();
		
		resultat = nombre1 - nombre2;
		System.out.println(nombre1 + "-" + nombre2 + "=" + resultat);
		
		
		scanner.close();
	}
	
	public static void calculMultiplication() {
		int resultat;
		int nombre1;
		int nombre2;
		
		System.out.println("Choisir le premier nombre:");
		nombre1 = scanner.nextInt();
		System.out.println("Choisir le deuxieme nombre:");
		nombre2 = scanner.nextInt();
		
		resultat = nombre1 * nombre2;
		System.out.println(nombre1 + "*" + nombre2 + "=" + resultat);
		
		
		scanner.close();
	}
	
	public static void calculDivision() {
		int resultat;
		int nombre1;
		int nombre2;
		
		System.out.println("Choisir le premier nombre:");
		nombre1 = scanner.nextInt();
		System.out.println("Choisir le deuxieme nombre:");
		nombre2 = scanner.nextInt();
		
		resultat = nombre1 / nombre2;
		System.out.println(nombre1 + "/" + nombre2 + "=" + resultat);
		
		
		scanner.close();
	}
	
	public static void calculModulo() {
		int resultat;
		int nombre1;
		int nombre2;
		
		System.out.println("Choisir le premier nombre:");
		nombre1 = scanner.nextInt();
		System.out.println("Choisir le deuxieme nombre:");
		nombre2 = scanner.nextInt();
		
		resultat = nombre1 % nombre2;
		System.out.println(nombre1 + "%" + nombre2 + "=" + resultat);
		
		
		scanner.close();
	}
	
	public static void calculPuissanceAuCarre() {
		int resultat;
		int nombre1;
		
		System.out.println("Choisir un nombre:");
		nombre1 = scanner.nextInt();
		
		resultat = nombre1 * nombre1;
				
		System.out.println( nombre1+ " x2" + "=" + resultat);
		
		
		scanner.close();
	}
	
	public static void calculPuissance() {
		int resultat;
		int nombre1;
		int nombre2;
		
		System.out.println("Choisir le premier nombre:");
		nombre1 = scanner.nextInt();
		
		System.out.println("Choisir le deuxieme nombre:");
		nombre2 = scanner.nextInt();
		
		resultat = (int) Math.pow(nombre1, nombre2);
		
		System.out.println(nombre1 + "Xn" + nombre2 + "=" + resultat);
		
		
		scanner.close();
	}
	
	public static void calculRacineCarree() {
		int resultat;
		int nombre1;
		
		System.out.println("Choisir un nombre:");
		nombre1 = scanner.nextInt();
		
		resultat = (int) Math.sqrt(nombre1);
				
		System.out.println(nombre1 + "Rac2" + "=" + resultat);
		
		
		scanner.close();
	}
	
	public static void calculLogarithme() {
		int resultat;
		int nombre1;
		
		
		System.out.println("Choisir le premier nombre:");
		nombre1 = scanner.nextInt();
		
		resultat = (int) Math.log(nombre1);
		System.out.println(nombre1 + "Log" +  "=" + resultat);
		
		
		scanner.close();
	}
	
	public static void fermerProgramme() {
		System.exit(0);
	}
	
	private static void afficherMenu() {
		
		    System.out.println("Bienvenue");
	        System.out.println("Veuillez choisir votre operation en cliquant sur les lettres suivantes:");	  
	        System.out.println(" Addition--> A, Soustraction--> S, multiplication--> X, Division--> D, Modulo--> M, Puissance au carré--> C, Puissance--> P,  Racine carrée--> R, Logarithme--> L ou voulez vous Quitter le programme--> Q?");			
	}
}
